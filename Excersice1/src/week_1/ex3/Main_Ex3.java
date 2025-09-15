/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week_1.ex3;

/**
 *
 * @author Admin
 */
public class Main_Ex3 {
    public static void main(String[] args) {
        ConvertBase cB = new ConvertBase();
        int baseIn = Utils_CB.baseValue("Enter baseIn:");
        int baseOut = Utils_CB.baseValue("Enter baseOut:");
        cB.setInput(Utils_CB.valueInput(baseIn));

        String input = cB.getInput();
        if (baseIn == baseOut) {
            System.out.println(input);
            return;
        }
        String type = baseIn + "," + baseOut;
        switch (type) {
            case "2,10" -> {
                System.out.println(cB.binaryToDecimal(input));
            }
            case "10,2" -> {
                System.out.println(cB.decimalToBinary(input));
            }
            case "10,16" -> {
                System.out.println(cB.decimalToHex(input));
            }
            case "16,10" -> {
                System.out.println(cB.hexToDecimal(input));
            }
            case "2,16" -> {
                System.out.println(cB.decimalToHex(cB.binaryToDecimal(input)));
            }
            case "16,2" -> {
                System.out.println(cB.decimalToBinary(cB.hexToDecimal(input)));
            }

        }
    }
}
