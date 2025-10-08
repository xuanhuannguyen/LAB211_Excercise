/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week_5.Ex1.Model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Admin
 */
public class Reservation {
    private String bookingID, customerName, phoneNumber, roomNumber;
    private LocalDate bookingDate;
    private FlightInformation flightInformation;

    public Reservation(String bookingID, String customerName, String phoneNumber, String roomNumber, LocalDate bookingDate, FlightInformation flghtFlightInformation) {
        this.bookingID = bookingID;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.roomNumber = roomNumber;
        this.bookingDate = bookingDate;
        this.flightInformation = flghtFlightInformation;
    }

    public Reservation() {
    
    }

    public String getBookingID() {
        return bookingID;
    }

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public LocalDate getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(LocalDate bookingDate) {
        this.bookingDate = bookingDate;
    }

    public FlightInformation getFlightInformation() {
        return flightInformation;
    }

    public void setFlightInformation(FlightInformation flghtFlightInformation) {
        this.flightInformation = flghtFlightInformation;
    }

    @Override
    public String toString() {
    DateTimeFormatter dateFmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    DateTimeFormatter dateTimeFmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    String bookingDateStr = (bookingDate != null)
            ? bookingDate.format(dateFmt)
            : "N/A";
    if(flightInformation == null) {
        return String.format("| %-8s | %-15s | %-12s | %-6s | %-12s | %-16s |",
            bookingID,
            customerName,
            phoneNumber,
            roomNumber,
            bookingDateStr,
            "No pick Up");
    }
    
  
    String timePickupStr = (flightInformation != null 
            && flightInformation.getTimePickup() != null)
            ? flightInformation.getTimePickup().format(dateTimeFmt)
            : "No Pick Up";
    return String.format("| %-8s | %-15s | %-12s | %-6s | %-12s | %-12s | %-12s | %-16s |",
            bookingID,
            customerName,
            phoneNumber,
            roomNumber,
            bookingDateStr,
            flightInformation.getFlightNumber(),
            flightInformation.getSeatNumber(),
            timePickupStr);
    }
    
    
    
    
    
}
