/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week_1.ex2;

import java.util.Random;

/**
 *
 * @author Admin
 */
public class LinearSearch {
    private int[] array;

    public LinearSearch(int n) {
        this.array = new int[n];
    }
    
    public void addArray(int x) {
        Random random= new Random();
        for (int i = 0 ; i < array.length ; i++)
        {
            array[i] = random.nextInt(x);
        }
    }
    public void displayArray() {
        for (int i = 0 ; i< array.length ; i++)
        {
            System.out.print(array[i]+" ");
        }
    }
    public int findElement(int x) {
        for (int i = 0 ; i< array.length ; i++)
        {
            if (array[i] == x) return i;
        }
        return -1;
    }
    
    
}
