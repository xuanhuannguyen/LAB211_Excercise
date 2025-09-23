/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week_3_ex2;

import Utils.Validator;

/**
 *
 * @author Admin
 */
public class Main_Ex2 {
    private QuickSort qS;
    public void run() {
        int n = Validator.validPositiveInt("Enter number of arrays: ");
        qS = new QuickSort(n);
        qS.display();
        qS.sort(0, n-1);
        qS.display();
    }
    public static void main(String[] args) {
        Main_Ex2 main = new Main_Ex2();
        main.run();
    }
}

