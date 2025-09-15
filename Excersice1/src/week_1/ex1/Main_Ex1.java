/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week_1.ex1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main_Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        WordCounter counter = new WordCounter(str);
        System.out.println(counter.countWords());
        System.out.println(counter.countChars());
        sc.close();
    }
}
