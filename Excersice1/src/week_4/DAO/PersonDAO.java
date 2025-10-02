/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week_4.DAO;

import DatabaseConnection.Week4_Connection;
import week_4.model.Person;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class PersonDAO {
    public boolean add(Person person) throws SQLException {
        String sql = "insert into Persons(ID,FullName,Number,YearOfBirth,Major) values(?,?,?,?,?)";
        try (Connection con = Week4_Connection.Week4_Connection() ;
                PreparedStatement pst = con.prepareStatement(sql)){
            pst.setString(1, person.getID());
            pst.setString(2, person.getFullName());
            pst.setString(3, person.getNumber());
            pst.setInt(4,person.getYearOfBirth());
            pst.setString(5, person.getMajor());
            return pst.executeUpdate()>0;
        }
    }
    public List<Person> findAll() throws SQLException {
        List<Person> personList = new ArrayList<>();
        String sql = "select * from Persons";
         try (Connection con = Week4_Connection.Week4_Connection() ;
              PreparedStatement pst = con.prepareStatement(sql);
              ResultSet rs = pst.executeQuery()   )
        {
            while (rs.next()) {
                Person person = new Person(rs.getString("ID").trim(),rs.getString("FullName").trim(),rs.getString("Number").trim(),
                   rs.getInt("YearOfBirth"),rs.getString("Major").trim());
                personList.add(person);
        }
    }
     return personList;
        
    }
    public static void main(String[] args) throws SQLException {
        PersonDAO main = new PersonDAO();
        for (Person person : main.findAll()) {
            System.out.println(person);
        }
    }
}
