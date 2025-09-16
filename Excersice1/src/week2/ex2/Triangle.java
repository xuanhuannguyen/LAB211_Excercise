/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2.ex2;

/**
 *
 * @author Admin
 */
public class Triangle extends Shape{
    private float sideA,sideB,sideC;

    public Triangle(float sideA, float sideB, float sideC) {
        super("Triangle");
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public Triangle() {
        super("Triangle");
    }

    public float getSideA() {
        return sideA;
    }

    public void setSideA(float sideA) {
        this.sideA = sideA;
    }

    public float getSideB() {
        return sideB;
    }

    public void setSideB(float sideB) {
        this.sideB = sideB;
    }

    public float getSideC() {
        return sideC;
    }

    public void setSideC(float sideC) {
        this.sideC = sideC;
    }
    
    
    
    @Override
    public float getPerimeter() {
        return sideA+sideB+sideC;
         }

    @Override
    public float getArea() {
        float p = getPerimeter() / 2.0f; // nửa chu vi
        return (float)Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
           }

    @Override
    public void printResult() {
        System.out.println("------Triangle-----");
        System.out.println("Side A, Side B, SideC : " + sideA +" ,"+ sideB +" ,"+ sideC)  ;
        System.out.println("Perimeter , Area" + getPerimeter() + " ," +getArea());
   }
    
}
