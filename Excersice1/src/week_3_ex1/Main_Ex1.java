/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week_3_ex1;

import Utils.Validator;

/**
 *
 * @author Admin
 */
public class Main_Ex1 {
    private BubleSort bS ;
    public void run() {
       int n = Validator.validPositiveInt("Enter the number of array:");
        bS = new BubleSort(n);
        bS.display();
        bS.sort();
        bS.display();
    }
    public static void main(String[] args) {
        Main_Ex1 main = new Main_Ex1();
        main.run();
       
    }
}
