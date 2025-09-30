/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week_4.model;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 *
 * @author Admin
 */
public class PersonList {
    private ArrayList<Person> personList;

    public PersonList() {
        personList = new ArrayList<>();
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }
    public ArrayList<Student> getStudentList() {
        ArrayList<Student> studentList = new ArrayList<>();
        for (Person p : personList) {
            if (p instanceof Student) {
                studentList.add((Student) p);
            }
        }
        return studentList;
    }
    public ArrayList<Teacher> getTeacherList() {
        ArrayList<Teacher> teacherList = new ArrayList<>();
        for (Person p : personList) {
            if (p instanceof Teacher) {
                teacherList.add((Teacher) p);
            }
        }
        return teacherList;
    }
    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }

    
    
    public void addPerson(Person person) {
        personList.add(person);
    }
    
    public boolean isIdExist(String id) {
        for (Person person : personList) {
            if (person.getID().equals(id)) return true;
        }
        return false;
    }
    public boolean isNumberExist(String number) {
       for (Person person : personList) {
            if (person.getNumber().equals(number) ) return true;
        }
        return false; 
    }
    public ArrayList<Person> search(Predicate<Person> p) {
        ArrayList<Person> resultList = new ArrayList<>();
        for (Person person : personList) {
            if (p.test(person)) resultList.add(person);
        }
        return resultList;
    }
}
