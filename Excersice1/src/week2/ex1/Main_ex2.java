/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2.ex1;

import Utils.Menu;
import Utils.Validator;

/**
 *
 * @author Admin
 */
public class Main_ex2 extends Menu {
    private CaculatorProgram caculProgram;

    public Main_ex2(String title, String[] function) {
        super(title, function);
        caculProgram = new CaculatorProgram();
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
        Float memory = null;
        String operator = "";
        while (true) {
            float number;
            if (memory == null) {
                memory = Validator.validFloat("Enter number:");
                operator = Utils_ex2.vaidOperator();
                if (operator.equals("="))
                    break;
                number = Validator.validFloat("Enter number:");
            } else {
                operator = Utils_ex2.vaidOperator();
                if (operator.equals("="))
                    break;
                number = Validator.validFloat("Enter number:");
            }
            memory = caculProgram.normalCal(memory, number, operator);
            System.out.println("Memory: " + memory);

        }
        System.out.println("Result:" + memory);
    }

    public void bmiCal() {
        float weight = Validator.validFloat("Enter Weight(kg): ");
        float height = Validator.validFloat("Enter Height(cm): ");
        System.out.println(caculProgram.BMICal(weight, height));
    }

    public static void main(String[] args) {
        String[] menu = { "Normal Caculator", "BMI Calculator", "Exit" };
        Main_ex2 main = new Main_ex2("Calculator Program", menu);
        main.run();

    }

}
