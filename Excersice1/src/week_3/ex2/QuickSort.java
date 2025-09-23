/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week_3.ex2;

import java.util.Random;

/**
 *
 * @author Admin
 */
public class QuickSort {
     int length;
    int arrays[];

    public QuickSort(int n) {
        this.length = n;
        arrays = new int[n];
        Random rand = new Random();
        for (int i = 0 ; i<length ; i++) 
        {
        arrays[i] =  rand.nextInt(100);
        }
    }
    public void sort(int start, int end) {
        if (start >= end) return;
        int pivot = partition(start, end);
        sort(start, pivot -1);
        sort(pivot+1, end);
        
        
    }
    public int partition(int start,int end) {
        int j = start -1;
        int pivot = arrays[end];
        for (int i = start; i < end; i++) {
            if (arrays[i] < pivot) {
                j++;
                int temp = arrays[j];
                arrays[j] = arrays[i];
                arrays[i] = temp;
            }
        }
            j++;
            int temp = arrays[j];
            arrays[j] = arrays[end];
            arrays[end] = temp;
            
        
        return j;
    }
            
    public void display() {
        for (int i = 0; i < length; i++) {
            System.out.print(arrays[i] + " ");
            
        }
        System.out.println("");
    }        
}
