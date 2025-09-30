/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week_4.model;

/**
 *
 * @author Admin
 */
public class Student extends Person {

    private int yearOfAdmisson;
    private double entranceEnglishScore;

    public Student(String ID, String fullName, String number, int yearOfBirth, String major, int yearOfAdmisson, double entranceEnglishScore) {
        super(ID, fullName, number, yearOfBirth, major);
        this.yearOfAdmisson = yearOfAdmisson;
        this.entranceEnglishScore = entranceEnglishScore;
    }

    @Override
    public String toString() {
        return super.toString() + "yearOfAdmisson=" + yearOfAdmisson + ", entranceEnglishScore=" + entranceEnglishScore + '}';
    }

    public int getYearOfAdmisson() {
        return yearOfAdmisson;
    }

    public void setYearOfAdmisson(int yearOfAdmisson) {
        this.yearOfAdmisson = yearOfAdmisson;
    }

    public double getEntranceEnglishScore() {
        return entranceEnglishScore;
    }

    public void setEntranceEnglishScore(double entranceEnglishScore) {
        this.entranceEnglishScore = entranceEnglishScore;
    }

}
