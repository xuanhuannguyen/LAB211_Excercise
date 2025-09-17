/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2.ex3;

/**
 *
 * @author Admin
 */
public class MatrixService {
     public Matrix  matrixAdd(Matrix matrix1, Matrix matrix2) { 
        Matrix result = new Matrix(matrix1.getRow(), matrix1.getColumn());
        for (int i = 0;i< result.getRow();i++) {
            for (int j=0 ; j< result.getColumn();j ++) {
                result.setData(i, j, matrix1.getData(i, j) + matrix2.getData(i, j));
            }
        }
        return result;
    }
       public Matrix  matrixSub(Matrix matrix1, Matrix matrix2) { 
        Matrix result = new Matrix(matrix1.getRow(), matrix1.getColumn());
        for (int i = 0;i< result.getRow();i++) {
            for (int j=0 ; j< result.getColumn();j ++) {
                result.setData(i, j, matrix1.getData(i, j) - matrix2.getData(i, j));
            }
        }
        return result;
    }
       public Matrix matrixMul(Matrix matrix1, Matrix matrix2) {
           Matrix result = new Matrix(matrix1.getRow(),matrix2.getColumn());
           int length = matrix1.getColumn();
           for (int i = 0;i< result.getRow();i++) {
            for (int j=0 ; j< result.getColumn();j ++) {
                int temp = 0;
                for (int x = 0 ; x < length ; x ++ ) {
                    temp += (matrix1.getData(i, x) * matrix2.getData(x, j) );
                }
                result.setData(i, j, temp);
            }
        }
        return result;
       }
    
}
