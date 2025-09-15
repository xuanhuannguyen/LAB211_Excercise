package Utils;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Validator {
    static Scanner scan = new Scanner(System.in);
    public static float validFloat(String input)
    {
       
        while (true)
        { 
            if (!input.equals("")) System.out.print(input);
            String value = scan.nextLine().trim();
            try {
                float x = Float.parseFloat(value);
                return x;
                
            } catch (NumberFormatException e) {
                System.out.println("Invalid! Enter the number");
                
            }
        }
    }
    public static int validInt(String input)
    {
       
        while (true)
        { 
            if (!input.equals("")) System.out.print(input);
            String value = scan.nextLine().trim();
            try {
                int x = Integer.parseInt(value);
                return x;
                
            } catch (NumberFormatException e) {
                System.out.println("Invalid! Enter the integer number");
                
            }
        }
    }
    public static int validPositiveInt(String input)
    {
       
        while (true)
        { 
            if (!input.equals("")) System.out.print(input);
            String value = scan.nextLine().trim();
            try {
                int x = Integer.parseInt(value);
                if (x < 1) {
                    throw new NumberFormatException();
                }
                return x;
                
            } catch (NumberFormatException e) {
                System.out.println("Invalid! Enter the positive integer number");
                
            }
        }
    }
      public static int validSelected(int n)
    {
        Scanner scan = new Scanner(System.in);
         while (true)
        { 
            String value = scan.nextLine().trim();
            try {
                int x = Integer.parseInt(value);
                if (x > 0 || x <=n) 
                    return x;
                System.out.println("Invalid! The number must be postive and <= "+n);
                
            } catch (NumberFormatException e) {
                System.out.println("Invalid! Enter the positive number");
                
            }
        }
    }
    public static boolean isEven(float input) {
        return input % 2 == 0;
    }
    public static boolean isPerfectSquare(float input) {
        if (input <= 0)  return false;
        return (Math.sqrt(input) * Math.sqrt(input)) == input;
    }
    
}
