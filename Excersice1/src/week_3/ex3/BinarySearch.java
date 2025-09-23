/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week_3.ex3;

import java.util.Random;

/**
 *
 * @author Admin
 */
public class BinarySearch {
    int length;
    int arrays[];

    public BinarySearch(int n) {
        this.length = n;
        arrays = new int[n];
        Random rand = new Random();
        for (int i = 0 ; i<length ; i++) 
        {
        arrays[i] =  rand.nextInt(n);
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
    public void searchFunction(int x) {
        
        sort(0,length-1);
        display();
        binarySearch(x,0,length-1);
    }
    public void binarySearch(int x, int start,int end) {
        if (start>end) {System.out.println("Not found");
        return;
        }
        int mid = (start+end) /2;
        if (arrays[mid] == x) {
            System.out.println("found at index " + ((start+end)/2));
            return;
        }
        if (x>arrays[mid]) binarySearch(x,mid+1, end);
                else binarySearch(x, start, mid-1);
    }
    public void display() {
        for (int i = 0; i < length; i++) {
            System.out.print(arrays[i] + " ");
            
        }
        System.out.println("");
    }        
}
