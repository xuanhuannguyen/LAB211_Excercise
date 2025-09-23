/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week_2.ex1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Utils_ex2 {
    public static String vaidOperator() {
        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.print("Enter Operatpor:");
            String operator = scan.nextLine();
            operator = operator.trim();
            if ("+-*/^=".contains(operator))
                return operator;
            System.out.println("Please input (+,-,*,/,^) ");
        }
    }
}
