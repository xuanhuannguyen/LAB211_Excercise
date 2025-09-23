/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week_2.ex3;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Matrix {
    private int row,column;
    private int data[][]; 

    public Matrix(int row, int column) {
        this.row = row;
        this.column = column;
        data = new int[row][column];
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getData(int r , int c) {
        return data[r][c];
    }

    public void setData(int r,int c,int data) {
        this.data[r][c] = data;
    }
    public int[][] raw() {
        return data;
    }
    
    
}
