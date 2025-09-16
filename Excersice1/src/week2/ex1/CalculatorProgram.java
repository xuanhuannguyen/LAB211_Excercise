/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2.ex1;

/**
 *
 * @author Admin
 */
public class CalculatorProgram {
    private Float memory;

    public CalculatorProgram() {
    }

    public Float getMemory() {
        return memory;
    }

    public void setMemory(float memory) {
        this.memory = memory;
    }
    
    public void calculate(float number, String operator) {
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
    }

}
