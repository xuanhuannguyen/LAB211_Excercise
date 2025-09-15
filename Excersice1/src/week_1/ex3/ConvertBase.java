/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week_1.ex3;

/**
 *
 * @author Admin
 */
public class ConvertBase {
    static final String HEX = "0123456789ABCDEF";
    private String input;

    public void setInput(String input) {
        this.input = input;
    }

    public String binaryToDecimal(String input) {
        int result = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            result = result * 2 + (c - '0');
        }
        return Integer.toString(result);

    }

    public String decimalToBinary(String input) {
        if (input.equals("0"))
            return "0";
        int n = Integer.parseInt(input);
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            int remainder = n % 2;
            sb.append(remainder);
            n = n / 2;
        }
        return sb.reverse().toString();
    }

    public String decimalToHex(String input) {
        char[] hexChar = "0123456789ABCDEF".toCharArray();
        if (input.equals("0"))
            return "0";
        int n = Integer.parseInt(input);
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            int remainder = n % 16;
            sb.append(hexChar[remainder]);
            n = n / 16;
        }
        return sb.reverse().toString();
    }

    public String hexToDecimal(String input) {
        int result = 0;
        String hex = "0123456789ABCDEF";
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            int value = hex.indexOf(c);
            result = result * 16 + value;
        }
        return Integer.toString(result);
    }

    public String getInput() {
        return input;
    }

}
