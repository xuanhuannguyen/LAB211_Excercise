/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week_4.model;

/**
 *
 * @author Admin
 */
public class Teacher extends Person{
    private int yearInProfession;
    private String contactType;
    private double salaryCoeffcient;

    public Teacher(String ID, String fullName, String number, int yearOfBirth, String major,int yearInProfession, String contactType, double salaryCoeffcient) {
        super(ID, fullName, number, yearOfBirth, major);
        this.yearInProfession = yearInProfession;
        this.contactType = contactType;
        this.salaryCoeffcient = salaryCoeffcient;
    }

    public int getYearInProfession() {
        return yearInProfession;
    }

    public void setYearInProfession(int yearInProfession) {
        this.yearInProfession = yearInProfession;
    }

    public String getContactType() {
        return contactType;
    }

    public void setContactType(String contactType) {
        this.contactType = contactType;
    }

    public double getSalaryCoeffcient() {
        return salaryCoeffcient;
    }

    public void setSalaryCoeffcient(double salaryCoeffcient) {
        this.salaryCoeffcient = salaryCoeffcient;
    }

    @Override
    public String toString() {
        return super.toStringPerson()+ "yearInProfession=" + yearInProfession + ", contactType=" + contactType + ", salaryCoeffcient=" + salaryCoeffcient + '}';
    }
    
    
   
    
}
