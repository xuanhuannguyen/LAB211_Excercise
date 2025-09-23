/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week_2.ex2;

/**
 *
 * @author Admin
 */
public class Main_Ex2 {
    public static void main(String[] args) {
        System.out.println("----Circle-----");
        Shape circle = new Circle(Utils.Validator.validPositiveFloat("Radius: "));
        System.out.println("----Rectangle-----");
        Shape retangle = new Rectangle(Utils.Validator.validPositiveFloat("Width: "), Utils.Validator.validPositiveFloat("Lenght: "));
        System.out.println("----Triangle-----");
        boolean checkTriangle = false;
        float sideA =0 ,sideB = 0,sideC = 0;
        while (checkTriangle == false) {
             sideA = Utils.Validator.validPositiveFloat("SideA: ");
             sideB = Utils.Validator.validPositiveFloat("SideB: ");
             sideC = Utils.Validator.validPositiveFloat("SideC: ");
            checkTriangle = Utils_Ex2.isSideTriangle(sideA, sideB, sideC);
            if (checkTriangle == false) {
                System.out.println("3 sides isn't side of triangle!");
            }
        }
        Shape triangle = new Triangle(sideA, sideB, sideC);
        Shape[] allShape = {circle,retangle,triangle};
        
        for (Shape shape : allShape) {
            shape.printResult();
        }
    }
    
    
    
}
