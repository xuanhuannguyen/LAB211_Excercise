/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week_3.ex3;

import Utils.Validator;

/**
 *
 * @author Admin
 */
public class Main_Ex3 {
  private BinarySearch bS;
  public void run() {
      int n = Validator.validPositiveInt("Enter the number");
      int x = Validator.validInt("Enter number wanna find: ");
      bS = new BinarySearch(n);
      bS.searchFunction(x);
      
  }
    public static void main(String[] args) {
        Main_Ex3 main = new Main_Ex3();
        main.run();
    }
}
