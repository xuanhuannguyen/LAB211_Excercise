/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week_1.ex4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Admin
 */
public class EquationProgram {
    public List<Float> caculateEquation(float a, float b) {
        if (a == 0 && b == 0) {
            return new ArrayList();
        } else if (a == 0) {
            return null;
        } else {
            return Collections.singletonList(-b / a);
        }

    }

    public List<Float> caculateQuadraticEquation(float a, float b, float c) {
        if (a == 0) {
            return caculateEquation(b, c);
        }
        float delta = b * b - 4 * a * c;
        if (delta < 0) {
            return null;
        } else if (delta == 0) {
            float x = -b / (2 * a);
            return Collections.singletonList(x);
        } else {
            float sqrtD = (float) Math.sqrt(delta);
            float x1 = (-b + sqrtD) / (2 * a);
            float x2 = (-b - sqrtD) / (2 * a);
            return Arrays.asList(x1, x2);
        }
    }
}
