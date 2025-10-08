/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week_5.Ex1.View;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author Admin
 */
public class ReservationUtils {
    private static final Scanner scan = new Scanner(System.in);
    static public String inputValid(String promt, String regex , String errorMessage) 
    {
        String input;
        while(true) {
            System.out.print(promt);
            input = scan.nextLine().trim();
            if (input.matches(regex))
            {
                return input;
            }
            System.out.println(errorMessage);
        }
    }
    static public String updateValid(String promt, String regex , String errorMessage) 
    {
        String input;
        while(true) {
            System.out.print(promt);
            input = scan.nextLine().trim();
            if (input.equals("")) return "skip";
            if (input.matches(regex))
            {
                return input;
            }
            System.out.println(errorMessage);
        }
    }
    public static String inputBookingID()
            {
                return inputValid("Enter 6-digit ID: ","\\d{6}","ID must be exactly 6 disgits");
            }
    public static String inputCusName() {
        return inputValid("Enter customer name: ","[A-Za-z ]+","Name must be contain only letters and spaces");
    }
    public static String inputCusPhone() {
        return inputValid("Enter 12-digits phone number: ","\\d{12}","Phone must be exactly 12 digits");
    }
    public static String inputRoomNumber() {
        return inputValid("Enter room number: ", "\\d{4}", "Room number must be exactly 4 digits");
    }
    public static String inputFlightNumber() {
        return inputValid("Enter flight number: ", "[A-za-z0-9]{6}", "Flight number must be exactly 6 characters");
    }
     public static String inputSeatNumber() {
        return inputValid("Enter seat number: ", "[A-za-z0-9]{4}", "Seat number must be exactly  characters");
    }
     public static LocalDate inputBookingDate()
    {
       
 
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/uuuu").withResolverStyle(ResolverStyle.STRICT);
        while (true) {
            try {
                System.out.print("Enter the booking date:");
                 String input = scan.nextLine().trim();
                LocalDate date = LocalDate.parse(input,format);  
                if (date.isAfter(LocalDate.now()))
                    return date;
                System.out.println("Date must be after present!");
            } catch (DateTimeParseException e) {
                return null;
            }
        }
    }
      public static LocalDate updateBookingDate()
    {
       
 
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/uuuu").withResolverStyle(ResolverStyle.STRICT);
        while (true) {
            try {
                System.out.print("Enter the booking date:");
                 String input = scan.nextLine().trim();
                 if (input.isEmpty()) return null;
                LocalDate date = LocalDate.parse(input,format);  
                if (date.isAfter(LocalDate.now()))
                    return date;
                System.out.println("Date must be after present!");
            } catch (DateTimeParseException e) {
                return null;
            }
        }
    }
     public static LocalDateTime inputTimePickUp(LocalDate bookingDate) {
          
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/uuuu HH:mm").withResolverStyle(ResolverStyle.STRICT);
        while (true) {
            try {
                System.out.print("Enter the time pick up: ");
                String input = scan.nextLine().trim();
                LocalDateTime bookingAtEnd = bookingDate.atTime(23,59);
                LocalDateTime date = LocalDateTime.parse(input,format);  
                if (date.isAfter(LocalDateTime.now()) && date.isBefore(bookingAtEnd))
                    return date;
                System.out.println("Date must be after present and before booking date!");
            } catch (DateTimeParseException e) {
                System.out.println("Invalid date/time value!");
            }
        }
     }
      public static LocalDateTime updateTimePickUp(LocalDate bookingDate) {
          
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/uuuu HH:mm").withResolverStyle(ResolverStyle.STRICT);
        while (true) {
            try {
                System.out.print("Enter the time pick up: ");
                String input = scan.nextLine().trim();
                if (input.isEmpty()) return null;
                LocalDateTime bookingAtEnd = bookingDate.atTime(23,59);
                LocalDateTime date = LocalDateTime.parse(input,format);  
                if (date.isAfter(LocalDateTime.now()) && date.isBefore(bookingAtEnd))
                    return date;
                System.out.println("Date must be after present and before booking date!");
            } catch (DateTimeParseException e) {
                System.out.println("Invalid date/time value!");
            }
        }
     }
     public static boolean getYesNo(String  promt) {
         System.out.print(promt + "(Y/N): ");
         while (true) {
             String input = scan.nextLine().trim();
             if (input.equalsIgnoreCase("y")) return true;
             if (input.equalsIgnoreCase("N")) return false;
             System.out.println("Invaild answer! (Y/N) : ");
         }
     }
}
