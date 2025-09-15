/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week_1.ex4;

import Utils.Menu;
import Utils.Validator;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author Admin
 */
public class Main_Ex4 extends Menu {
    private EquationProgram eP;
    static private List<Float> numberList;

    public Main_Ex4(String title, String[] function) {
        super(title, function);
        eP = new EquationProgram();
    }

    public void checkFunction(Predicate<Float> p) {
        for (Float number : numberList) {
            if (p.test(number))
                System.out.print(number + " ");
        }
    }

    public void execute(int n) {
        switch (n) {
            case 1 -> {
                superlativeE();
            }
            case 2 -> {
                quadraticE();
            }
        }
    }

    public void superlativeE() {
        float a = Validator.validFloat("Enter A: ");
        float b = Validator.validFloat("Enter B: ");
        numberList = new ArrayList<>();
        numberList.add(a);
        numberList.add(b);
        List<Float> result = eP.caculateEquation(a, b);
        if (result == null) {
            System.out.println("No solution");
        } else if (result.isEmpty()) {
            System.out.println("Infinitely many solution");
        } else {
            System.out.println("x: " + result);
        }
        System.out.println("Odd number:");
        checkFunction(p -> !Validator.isEven(p));
        System.out.println("");
        System.out.println("Even number:");
        checkFunction(p -> Validator.isEven(p));
        System.out.println("");
        System.out.println("Perfect square number:");
        checkFunction(p -> Validator.isPerfectSquare(p));
        System.out.println("");
    }

    public void quadraticE() {
        float a = Validator.validFloat("Enter A: ");
        float b = Validator.validFloat("Enter B: ");
        float c = Validator.validFloat("Enter C: ");
        numberList = new ArrayList<>();
        numberList.add(a);
        numberList.add(b);
        numberList.add(c);
        List<Float> result = eP.caculateQuadraticEquation(a, b, c);
        if (result == null) {
            System.out.println("No solution");
        } else if (result.isEmpty()) {
            System.out.println("Infinitely many solution");
        } else {
            System.out.println(result);
        }
        System.out.println("Odd number:");
        checkFunction(p -> !Validator.isEven(p));
        System.out.println("");
        System.out.println("Even number:");
        checkFunction(p -> Validator.isEven(p));
        System.out.println("");
        System.out.println("Perfect square number:");
        checkFunction(p -> Validator.isPerfectSquare(p));
        System.out.println("");
    }

    public static void main(String[] args) {
        String[] menu = { "Calculate Superlative Equation", "Calculate Quadratic Equation", "Exit" };
        Main_Ex4 main = new Main_Ex4("--Equation Program--", menu);
        main.run();
    }
}
