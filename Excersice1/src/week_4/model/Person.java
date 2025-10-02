/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week_4.model;

import java.time.LocalDate;

/**
 *
 * @author Admin
 */
public class Person {
    private String ID;
    private String fullName;
    private String number;
    private int yearOfBirth;
    private String major;


    public Person(String ID, String fullName, String number, int yearOfBirth, String major) {
        this.ID = ID;
        this.fullName = fullName;
        this.number = number;
        this.yearOfBirth = yearOfBirth;
        this.major = major;
    }

    public String toStringPerson() {
        return "Person{" + "ID=" + ID + ", fullName=" + fullName + ", number=" + number + ", yearOfBirth=" + yearOfBirth + ", major=" + major + '}';
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    
    
    
    
}
