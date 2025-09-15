/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2.ex1;

/**
 *
 * @author Admin
 */
public class CaculatorProgram {
    public float normalCal(float memory, float number, String operator) {
        switch (operator) {
            case "+" -> {
                memory += number;
            }
            case "-" -> {
                memory -= number;
            }
            case "*" -> {
                memory *= number;
            }
            case "/" -> {
                memory /= number;
            }
            case "^" -> {
                memory = (float) Math.pow(memory, number);
            }
        }
        return memory;
    }

    public String BMICal(float weight, float height) {
        float bmi = weight / (height * height) * 10000;
        System.out.printf("%.2f", bmi);
        if (bmi < 19) {
            return "Under-standard";
        } else if (bmi <= 25) {
            return "Standard";
        } else if (bmi <= 30) {
            return "Overweight";
        } else if (bmi <= 40) {
            return "Fat-should lose weight";
        } else {
            return "Very fat - go to gym right now!";
        }
    }
}
