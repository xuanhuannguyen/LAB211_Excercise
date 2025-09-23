/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week_2.ex2;

/**
 *
 * @author Admin
 */
public class Circle extends Shape{ 
    private float radius;

    public Circle(float radius) {
        super("Circle");
        this.radius = radius;
    }

    public Circle() {
        super("Circle");
    }
    
    @Override
    public float getPerimeter() {
        return (float) (2 * Math.PI * radius);
    }

    @Override
    public float getArea() {
        return (float) (Math.PI * radius * radius);
    }

    @Override
    public void printResult() {
        System.out.println("-----Circle-----");
        System.out.println("Radius: " + radius);
        System.out.println("Perimeter , Area" + getPerimeter() + " ," +getArea());
    }
    
    
}
