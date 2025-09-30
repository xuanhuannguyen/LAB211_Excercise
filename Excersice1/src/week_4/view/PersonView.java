/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week_4.view;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import week_4.model.Person;

/**
 *
 * @author Admin
 */
public class  PersonView {
    private static final Scanner scan = new Scanner(System.in);
    public static String inputId() {
        while (true) {
            System.out.print("Enter ID (6 digits):");
            String id = scan.nextLine().trim();
            if (id.matches("\\d{6}")) {
                return id;
            }
            System.out.println("Invalid ID!");
        }
    }
    public static String inputFullName() {
        while(true) {
            System.out.print("Enter full name");
            String fullName = scan.nextLine().trim();
            if (fullName.matches("[a-zA-Z ]+")) {
                return fullName;
            }
            System.out.println("Invalid full name!");
        }
    }
   public static String inputPhone() {
        while (true) {
            System.out.print("Enter phone number (12 digits): ");
            String phone = scan.nextLine().trim();
            if (phone.matches("\\d{12}")) {
                return phone;
            }
            System.out.println("Invalid phone. Must be 12 digits.");
        }
    }
    public static int inputYearOfBirth() {
        int currentYear = LocalDate.now().getYear();
        while (true) {
            try {
                System.out.println("Enter year of birth:");
                int year = Integer.parseInt(scan.nextLine().trim());
                if (year < currentYear)
                    return year;
                System.out.println("Invalid year! Must be less than current year!");
            } catch (Exception e) {
                System.out.println("Invalid ! Must be number!");
            }
        }
    }
   public static String inputMajor() {
        while (true) {
            System.out.print("Enter major (max 30 chars): ");
            String major = scan.nextLine().trim();
            if (major.length() <= 30) {
                return major;
            }
            System.out.println("Invalid major! . Must be <= 30 characters.");
        }
    }
   
}
