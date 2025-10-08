/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week_5.Ex1.Controller;

import Utils.Menu;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import week_5.Ex1.Model.FlightInformation;
import week_5.Ex1.Model.Reservation;
import week_5.Ex1.Model.ReservationList;
import week_5.Ex1.View.ReservationUtils;

/**
 *
 * @author Admin
 */
public class ReservationManagement extends Menu{
    private ReservationList objReservationList;

    public ReservationManagement(String title, String[] function) {
        super(title, function);
        objReservationList = new ReservationList();
    }

    @Override
    public void execute(int n) {
        switch(n) {
            case 1 -> {
                createNewReservation();
            }
            case 2 -> {
                updateReservation();
            }
            case 3 -> {
                deleteReservation();
            }
            case 4 -> {
                printFlightInformation();
            }
            case 5 -> {
                printAll();
            }
        }
    }
    public void updateReservation() {
        Scanner scan = new Scanner(System.in);
        String bookingID = ReservationUtils.inputBookingID();
        while (objReservationList.isExist(bookingID) == null) {
            System.out.println("No information found");
            if (ReservationUtils.getYesNo("Do you want find again?"))
            {
                bookingID = ReservationUtils.inputBookingID();
            }
            else {
                return;
            }
        }
        Reservation reservation = objReservationList.isExist(bookingID);
        System.out.println(reservation);
        System.out.println("If you do not want to change the information, just press enter to skip"); 
        String cusName = "";
        while(cusName.isEmpty()) {     
            cusName = ReservationUtils.updateValid("Customer Name: ", "[A-Za-z ]+", "Name must be contain only letters and spaces");
        } 
        if (!cusName.equals("skip")) {
            reservation.setCustomerName(cusName);
        }
        
        String cusPhone = "";
        while (cusPhone.isEmpty()) {     
            cusPhone = ReservationUtils.updateValid("Enter 12-digits phone number: ","\\d{12}","Phone must be exactly 12 digits");
        } 
        if (!cusPhone.equals("skip")) {
            reservation.setPhoneNumber(cusPhone);
        }
        
        String roomNumber ="";
        while (roomNumber.isEmpty()) {     
            roomNumber = ReservationUtils.updateValid("Enter room number: ", "\\d{4}", "Room number must be exactly 4 digits");
        }
        if (!roomNumber.equals("skip")) {
            reservation.setRoomNumber(roomNumber);
        }
        
        LocalDate bookingDate = ReservationUtils.updateBookingDate();
        if (bookingDate!=null) {
            reservation.setBookingDate(bookingDate);
        }
        
        
        System.out.println("Need airport pickup?: ");
        while(true) {
             String input = scan.nextLine().trim();
             if (input.equalsIgnoreCase("")) break;
             if (input.equalsIgnoreCase("Y")) {
                    FlightInformation flightIn4 = reservation.getFlightInformation();

                    String flightNumber = "";    
                    while(flightNumber.isEmpty()) {     
                    flightNumber = ReservationUtils.updateValid("Enter flight number: ", "[A-za-z0-9]{6}", "Flight number must be exactly 6 characters");
                        } 
                    if (!roomNumber.equals("skip")) {
                    flightIn4.setFlightNumber(flightNumber);
                   }
                    String seatNumber  = "";
                    while(seatNumber.isEmpty()) {     
                        seatNumber = ReservationUtils.updateValid("Enter seat number: ", "[A-za-z0-9]{4}", "Seat number must be exactly  characters");
                        } 
                    if (!seatNumber.equals("skip")) {
                    flightIn4.setSeatNumber(seatNumber);
                    }
                    LocalDateTime timePickUp = ReservationUtils.updateTimePickUp(reservation.getBookingDate());
                    if (timePickUp!=null) {
                        flightIn4.setTimePickup(timePickUp);
                    }
                    reservation.setFlightInformation(flightIn4);
                    break;
                }
         
             if (input.equalsIgnoreCase("N")) {
                 reservation.setFlightInformation(null);
                 break;
                 
             } 
             System.out.println("Invalid answer! (Y/N): ");
        }
        System.out.println(reservation);
        System.out.println("Updated Successfull!");
        
 
        
    }
    public void deleteReservation() {
        String bookingID = ReservationUtils.inputBookingID();
        while (objReservationList.isExist(bookingID) == null) {
            System.out.println("No information found");
            if (ReservationUtils.getYesNo("Do you want find again?"))
            {
                bookingID = ReservationUtils.inputBookingID();
            }
            else {
                return;
            }
        }
         if (ReservationUtils.getYesNo("Are you sure delete this information?")) {
             objReservationList.deleteReservation(objReservationList.isExist(bookingID));
             System.out.println("Information Delete Succesfully!");
         }
   
        

        
    }
    public void printFlightInformation() {
        ArrayList<Reservation> reservationNeedPickUpList = new  ArrayList<>();
        for (Reservation reservation : objReservationList.getReservationList()) {
            if (reservation.getFlightInformation()!=null) {
                reservationNeedPickUpList.add(reservation);
            }
        }
        reservationNeedPickUpList.sort(Comparator.comparing(r -> r.getFlightInformation().getTimePickup()));
        printFunction(reservationNeedPickUpList);
    }
    public void printAll() {
        printFunction(objReservationList.getReservationList());
    }
    public void printFunction(ArrayList<Reservation> reservationList) {
        if (reservationList.isEmpty()) System.out.println("Empty List!");
        for (Reservation reservation : reservationList) {
            System.out.println(reservation);
        }
    }
    public void createNewReservation() {
        String bookingID;
        while (true) {
            bookingID = ReservationUtils.inputBookingID();
            if (objReservationList.isExist(bookingID) == null)
            break;
            System.out.println("ID is exist!");
        }
        
        String cusName = ReservationUtils.inputCusName();
        String cusPhone = ReservationUtils.inputCusPhone();
        String roomNumber = ReservationUtils.inputRoomNumber();
        LocalDate bookingDate = ReservationUtils.inputBookingDate();
        FlightInformation flightInf;
        if (ReservationUtils.getYesNo("Need air port pick up? ")) {
            String flightNumber = ReservationUtils.inputFlightNumber();
            String seatNumber = ReservationUtils.inputSeatNumber();
            LocalDateTime timePickUp = ReservationUtils.inputTimePickUp(bookingDate);
            flightInf = new FlightInformation(flightNumber, seatNumber, timePickUp);
        } else
        {
           flightInf = null;
        }
        Reservation reservation = new Reservation(bookingID, cusName, roomNumber, roomNumber, bookingDate, flightInf);
        objReservationList.addReservation(reservation);
    }
    public static void main(String[] args) {
        String[] menu = {"Create new reservation","Update reservation",
            "Delete reservation","Print Flight Information","Print All","Exit"};
        ReservationManagement main = new ReservationManagement("*** Reservation ****", menu);
    main.run();
    }
}
