/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week_4.control;

import Utils.Menu;
import Utils.Validator;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import week_4.model.Person;
import week_4.model.PersonList;
import week_4.model.Student;
import week_4.model.Teacher;
import week_4.view.PersonView;

/**
 *
 * @author Admin
 */
public class Management extends Menu{
    private static final Scanner scan = new Scanner(System.in);
    private PersonList objPersonList;

    public Management(String title, String[] function) {
        super(title, function);
        objPersonList = new PersonList();
            
    }

    @Override
    public void execute(int n) {
        switch(n) {
            case 1 -> {
                teacher();
            }
            case 2 -> {
                student();
            }
            case 3 -> {
                person();
            }
        }
    
    }
    
    public void teacher() {
        String subMenuTeacher[] = {"Input","Print","Exit"};
        Menu subMenu = new Menu("--Teacher Management--", subMenuTeacher) {
            @Override
            public void execute(int n) {
                switch(n) {
                    case 1 -> {
                        inputTeacher();
                    }
                    case 2 -> {
                        printTeacher();
                    }
                }
                
            
            }
        };
        subMenu.run();
        
    }
     public void student() {
        String subMenuTeacher[] = {"Input","Print","Exit"};
        Menu subMenu = new Menu("--Student Management--", subMenuTeacher) {
            @Override
            public void execute(int n) {
                switch(n) {
                    case 1 -> {
                        inputStudent();
                    }
                    case 2 -> {
                        printStudent();
                    }
                }
                
            
            }
        };
        subMenu.run();
        
    }
    public void person() {
        String subMenuPerson[] = {"Search","Print all"};
        Menu subMenu = new Menu("--Person Management--",subMenuPerson) {
            @Override 
            public void execute(int n) {
                switch(n) {
                    case 1 -> {
                        search();
                    }
                    case 2 -> {
                        printAll();
                    }
                }
            }
        };
        subMenu.run();
    }
    public static void main(String[] args) {
        String menu[] = {"Tearcher","Student","Person","Exit"};
        Management main = new Management("--Information Management--", menu);
        main.run();
                
    }
    
    
//    Create an object each class;
    public Person objPerson() {
       String id;
       while (true) {
         id= PersonView.inputId();
        if (!objPersonList.isIdExist(id))
            break;
        System.out.println("ID exist!");
       }
       String fullName = PersonView.inputFullName();
       String number = PersonView.inputPhone();
       int yearOfBirth = PersonView.inputYearOfBirth();
       String major = PersonView.inputMajor();
       Person person = new Person(id, fullName, number, yearOfBirth, major);
       return person;
    }
   public Teacher objTeacher() {
       
       Person person = objPerson();
       int yearInProfession;
       while (true) {
           try {
               System.out.println("Enter year in the profession!");
                yearInProfession = Integer.parseInt(scan.nextLine().trim());
               if (yearInProfession >=0 && yearInProfession <= (LocalDate.now().getYear()-person.getYearOfBirth())) {
                   break;
               }
           } catch (Exception e) {
               System.out.println("Invalid number");
           }
       }
       String contract;
       while (true) {
           System.out.println("Enter the contract (Long/Short)");
           contract = scan.nextLine().trim(); 
           if (contract.equalsIgnoreCase("long") || contract.equalsIgnoreCase("short")) {
               contract = contract.toLowerCase();
               contract = Character.toUpperCase(contract.charAt(0)) + contract.substring(1);
               break;
           }
           System.out.println("Invalid type contact");
       }
       double salaryCoefficient = Utils.Validator.validPositiveFloat("Enter salary coefficient");
       Teacher teacher = new Teacher(person.getID(), person.getFullName(),person.getNumber(),person.getYearOfBirth(),person.getMajor(), yearInProfession, contract, salaryCoefficient);
       return teacher;
   }   
   public Student objStudent() {
       Person person = objPerson();
       int yearOfAdmisstion; 
       while(true) {
           System.out.println("Enter year of admission");
           try {
               yearOfAdmisstion = Integer.parseInt(scan.nextLine().trim());
               if (yearOfAdmisstion >= person.getYearOfBirth() && yearOfAdmisstion <= LocalDate.now().getYear())
               {
                   break;
               }
                System.out.println("Must be great than birth of year and less than current year!");
      
                   } catch (Exception e) {
                       System.out.println("Invalid number of year!");
           }
       }
       double entranceEnglishScore;
       while (true) {
           entranceEnglishScore = Validator.validPositiveFloat("Enter entrance English Score:");
           if (entranceEnglishScore <= 100) {
               break;
           }
           System.out.println("Invalid score! From 0 -> 100");
       }
       Student student = new Student(person.getID(), person.getFullName(),person.getNumber(),person.getYearOfBirth(),person.getMajor(), yearOfAdmisstion, entranceEnglishScore);
       return student;
   }
//   Input Function 
   public void inputTeacher() {
       objPersonList.addPerson(objTeacher());
   }
   
    public void printTeacher() {
        ArrayList<Teacher> teacherList = objPersonList.getTeacherList();
        teacherList.sort(Comparator.comparing(Teacher::getYearInProfession).reversed());
        print(teacherList);
    }
    
    public void inputStudent() {
        objPersonList.addPerson(objStudent());
    }
    public void printStudent() {
        ArrayList<Student> studentList = objPersonList.getStudentList();
        studentList.sort(Comparator.comparing(Student::getYearOfAdmisson));
        print(studentList);
    }
    
    public void search() {
        String keySearch = PersonView.inputFullName();
        for (Person person : objPersonList.search(p -> p.getFullName().equalsIgnoreCase(keySearch))) {
            System.out.println(person);
        }
    }
    public void printAll() {
        print(objPersonList.getPersonList());
    }
    public void print(Object object) {
        if (object instanceof Iterable<?>) {
           for (Object o : (Iterable<?>) object) {
               System.out.println(o);
           }
        }
    }
}



