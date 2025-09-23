/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week_2.ex1;

import Utils.Menu;
import Utils.Validator;

/**
 *
 * @author Admin
 */
public class Main_ex2 extends Menu {
    private CalculatorProgram calculProgram;
    private BMI_Calculator bmiCal;

    public Main_ex2(String title, String[] function) {
        super(title, function);
        
        bmiCal = new BMI_Calculator();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1 -> {
                normalCal();
            }
            case 2 -> {
                bmiCal();
            }
        }

    }

    public void normalCal() {
        calculProgram = new CalculatorProgram();
        String operator = "";
        calculProgram.setMemory(Validator.validFloat("Enter number:"));
        while (true) {
            float number;
            operator = Utils_ex2.vaidOperator();
            if (operator.equals("="))
                    break;
            number = Validator.validFloat("Enter number:");
            
            calculProgram.calculate(number, operator);
            System.out.println("Memory: " + calculProgram.getMemory());

        }
        System.out.println("Result:" +calculProgram.getMemory());
    }

    public void bmiCal() {
        bmiCal = new BMI_Calculator();
        bmiCal.setWeight(Validator.validFloat("Enter Weight(kg): "));
        bmiCal.setHeight(Validator.validFloat("Enter Height(cm): "));
        bmiCal.BMICal();
        System.out.println(bmiCal.BMICal());
    }

    public static void main(String[] args) {
        String[] menu = { "Normal Caculator", "BMI Calculator", "Exit" };
        Main_ex2 main = new Main_ex2("Calculator Program", menu);
        main.run();

    }

}
