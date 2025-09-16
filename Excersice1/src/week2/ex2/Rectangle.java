/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2.ex2;

/**
 *
 * @author Admin
 */
public class Rectangle extends Shape{
    private float width,length;

    public Rectangle(float width, float length) {
        super("Rectangle");
        this.width = width;
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    @Override
    public float getPerimeter() {
        return (length + width)*2;
    }

    @Override
    public float getArea() {
        return (length * width);
    }
   @Override
   public void printResult() {
       System.out.println("-----Rectangle------");
       System.out.println("Width , Length" + width + " ," + length);
       System.out.println("Perimeter , Area" + getPerimeter() + " ," +getArea());
   }
    
}
