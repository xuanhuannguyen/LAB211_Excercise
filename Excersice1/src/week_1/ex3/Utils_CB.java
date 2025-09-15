/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week_1.ex3;

import java.util.Scanner;
import static week_1.ex3.ConvertBase.HEX;

/**
 *
 * @author Admin
 */
public class Utils_CB {
    static boolean isBinary(String s) {
        if (s.isEmpty()) return false;
        for (char c : s.toCharArray()) {
            if (c != '0' && c!='1') return false;
        }
        return true;    
    }
    static boolean isDecimal(String s) {
        if (s.isEmpty()) return false;
        for (char c : s.toCharArray()) {
            if (c < '0' || c >'9') return false;
        }
        return true;    
    }
    static boolean isHex(String s) {
         if (s.isEmpty()) return false;
        for (char c : s.toCharArray()) {
            if (HEX.indexOf(c) < 0 ) return false;
        }
        return true;    
    }
    static int baseValue(String s) {
        Scanner sc = new Scanner(System.in);
        int base;
         while (true) {
            System.out.println(s);
            System.out.println("Enter your base in (2. Base 2 ; 10. Base 10 ; 16. Base 16) :");
            base = Integer.parseInt(sc.nextLine());
            if (base == 2 || base == 10 || base == 16)
            {
                return base;
            }
            System.out.println("Input invalid!");
            
        }
    }
     static public String valueInput(int baseIn) {
        Scanner sc = new Scanner(System.in);
        String input;
        while (true) {
            System.out.println("Enter the input :");
            input = sc.nextLine();
            input = input.trim().toUpperCase(); 
            if (baseIn == 2 && isBinary(input)) {
                break;
            }
            if (baseIn == 10 && isDecimal(input)) {
            break;
            }
            if (baseIn == 16 && isHex(input)) {
            break;
            }
            System.out.println("Input invalid!");
        }
        return input;
    }
}
