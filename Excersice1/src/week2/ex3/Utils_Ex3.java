/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2.ex3;

import Utils.Validator;

/**
 *
 * @author Admin
 */
public class Utils_Ex3 { 
    public static int[] validRowAndColumn(String input) {
        int[] rowAndColumn = new int[2];
        rowAndColumn[0] = Validator.validPositiveInt("Enter row " + input);
        rowAndColumn[1] = Validator.validPositiveInt("Enter Column " + input);
        return rowAndColumn;        
    }
    public static int[] validEqualRowAndColumn(int row,int column) {
        int[] rowAndColumn = new int[2];
        while (true) {
         rowAndColumn = validRowAndColumn("Matrix 2: ");
         if (rowAndColumn[0]==row && rowAndColumn[1]==column) {
             return rowAndColumn;
         }
            System.out.println("Enter equal row and column with matrix 1!");
        }
    }
    public static int[] validForMulMatrix(int column) {
        int[] rowAndColumn = new int[2];
        while (true) {
         rowAndColumn = validRowAndColumn("Matrix 2: ");
         if (rowAndColumn[0]==column) {
             return rowAndColumn;
         }
            System.out.println("Ente the row equal with column of matrix 1!");
        }
    }
    public static Matrix validMatrix(int row , int column,String input) {
        Matrix matrix = new Matrix(row, column);
        for (int i =  0 ; i< row ; i++) {
            for( int j = 0 ; j< column ; j++) {
                String str = String.format("Enter %s[%d][%d] : ", input,i+1,j+1);
                matrix.setData(i, j, Validator.validInt(str));
            }
        }
        return matrix;
    }
}
