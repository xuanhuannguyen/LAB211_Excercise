/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2.ex1;

/**
 *
 * @author Admin
 */
public class BMI_Calculator {
    float weight,height;

    public BMI_Calculator() {
    }
    
    public BMI_Calculator(float weight, float height) {
        this.weight = weight;
        this.height = height;
    }
    
    
    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
    
    public String BMICal() {
        float bmi = weight / (height * height) * 10000;
        String result = String.format("%.2f", bmi);
        if (bmi < 19) {
            return result +" Under-standard";
        } else if (bmi <= 25) {
            return result + " Standard";
        } else if (bmi <= 30) {
            return result + " Overweight";
        } else if (bmi <= 40) {
            return result + " Fat-should lose weight";
        } else {
            return result + " Very fat - go to gym right now!";
        }
    }
}
