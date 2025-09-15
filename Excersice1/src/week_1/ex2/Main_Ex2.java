/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week_1.ex2;

import Utils.Validator;

/**
 *
 * @author Admin
 */
public class Main_Ex2 {
    public static void main(String[] args) {
        LinearSearch lS = new LinearSearch(Validator.validPositiveInt("Enter Size:"));
        lS.addArray(Validator.validPositiveInt("Enter scope:"));
        lS.displayArray();
        System.out.println("");
        System.out.println(lS.findElement(Validator.validInt("Enter the input:")));
        ;
    }

}
