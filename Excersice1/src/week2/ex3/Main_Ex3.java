/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2.ex3;

import Utils.Menu;

/**
 *
 * @author Admin
 */
public class Main_Ex3 extends Menu{
    private MatrixService matrixService ;
    public Main_Ex3(String title, String[] function) {
        super(title, function);
        matrixService = new MatrixService();
    }

    @Override
    public void execute(int n) {
        switch(n) {
            case 1 -> {
                addMatrix();
            }
            case 2 -> {
                subMatrix();
            }
            case 3 -> {
                mulMatrix();
            }
        }
     }
    public void addMatrix() {
        int rowAndColumn1[] = Utils_Ex3.validRowAndColumn("matrix 1: ");
        Matrix matrix1 = Utils_Ex3.validMatrix(rowAndColumn1[0], rowAndColumn1[1], "matrix1");
        int rowAndColumn2[] = Utils_Ex3.validEqualRowAndColumn(rowAndColumn1[0], rowAndColumn1[1]);
        Matrix matrix2 = Utils_Ex3.validMatrix(rowAndColumn2[0], rowAndColumn2[1], "matrix2");
        display(matrix1);
        System.out.println("+");
        display(matrix2);
        System.out.println("=");
        display(matrixService.matrixAdd(matrix1, matrix2));
        
        
    }
    public void subMatrix() {
        int rowAndColumn1[] = Utils_Ex3.validRowAndColumn("matrix 1: ");
        Matrix matrix1 = Utils_Ex3.validMatrix(rowAndColumn1[0], rowAndColumn1[1], "matrix1");
        int rowAndColumn2[] = Utils_Ex3.validEqualRowAndColumn(rowAndColumn1[0], rowAndColumn1[1]);
        Matrix matrix2 = Utils_Ex3.validMatrix(rowAndColumn2[0], rowAndColumn2[1], "matrix2");
        display(matrix1);
        System.out.println("-");
        display(matrix2);
        System.out.println("=");
        display(matrixService.matrixSub(matrix1, matrix2));
        
        
    }
     public void mulMatrix() {
        int rowAndColumn1[] = Utils_Ex3.validRowAndColumn("matrix 1: ");
        Matrix matrix1 = Utils_Ex3.validMatrix(rowAndColumn1[0], rowAndColumn1[1], "matrix1");
        int rowAndColumn2[] = Utils_Ex3.validForMulMatrix(rowAndColumn1[1]);
        Matrix matrix2 = Utils_Ex3.validMatrix(rowAndColumn2[0], rowAndColumn2[1], "matrix2");
        display(matrix1);
        System.out.println("*");
        display(matrix2);
        System.out.println("=");
        display(matrixService.matrixMul(matrix1, matrix2));
        
        
    }
    public static void main(String[] args) {
        String[] menu = {"Add matrix","Sub matrix","Multi matrix","Exit"};
        Main_Ex3 main = new Main_Ex3("Caculator Program",menu);
        main.run();
    }
    public void display(Matrix matrix) {
        for (int i = 0 ;i<matrix.getRow() ; i++) {
            for (int j = 0 ; j< matrix.getColumn() ; j++) {
                System.out.print("[" + matrix.getData(i, j) + "]");
            }
            System.out.println();
        }
    }
}
