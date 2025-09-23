/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week_3_ex1;

import java.util.Random;

/**
 *
 * @author Admin
 */
public class BubleSort {
    int length;
    int arrays[];

    public BubleSort(int n) {
        this.length = n;
        arrays = new int[n];
        Random rand = new Random();
        for (int i = 0 ; i<length ; i++) 
        {
        arrays[i] =  rand.nextInt();
        }
    }
    public void sort() {
        for (int i = 1 ; i< length; i++) 
        {
            for (int j = 0; j < length-i; j++) {
                if (arrays[j]>arrays[j+1]) {
                    int temp = arrays[j];
                    arrays[j]= arrays[j+1];
                    arrays[j+1] = temp;
                }
            }
        }
        
        
    }
    public void display() {
        for (int i = 0; i < length; i++) {
            System.out.print(arrays[i] + " ");
            
        }
        System.out.println("");
    }
    
    
}
