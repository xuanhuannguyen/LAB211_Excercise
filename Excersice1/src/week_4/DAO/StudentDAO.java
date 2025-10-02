/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week_4.DAO;

import DatabaseConnection.Week4_Connection;
import week_4.model.Student;
import java.sql.*;
import java.util.ArrayList;
import week_4.model.Teacher;
/**
 *
 * @author Admin
 */
public class StudentDAO {
    
       public boolean add(Student student) throws SQLException {
        String sql = "{call dbo.Student_Insert(?,?,?,?,?,?,?)}";
        try (Connection con = Week4_Connection.Week4_Connection() ;
             CallableStatement cs = con.prepareCall(sql)){
            cs.setString(1, student.getID());
            cs.setString(2, student.getFullName());
            cs.setString(3, student.getNumber());
            cs.setInt(4, student.getYearOfBirth());
            cs.setString(5, student.getMajor());
            cs.setInt(6,student.getYearOfAdmisson());
            cs.setDouble(7, student.getEntranceEnglishScore());
            return cs.execute();
        }
    }
        public ArrayList<Student> getAll() throws SQLException {
        ArrayList<Student> studentList = new ArrayList<>();String sql =
        "SELECT p.ID AS personId, " +
        "       TRIM(p.FullName) AS fullName, " +
        "       TRIM(p.Number) AS number, " +
        "       p.YearOfBirth AS yearOfBirth, " +
        "       TRIM(p.Major) AS major, " +
        "       s.yearOfAdmission AS yearOfAdmission, " +
        "       s.entranceEnglishScore AS entranceEnglishScore " +
        "FROM Students s INNER JOIN Persons p ON s.ID = p.ID;";

          try (Connection con = Week4_Connection.Week4_Connection() ;
              PreparedStatement pst = con.prepareStatement(sql);
              ResultSet rs = pst.executeQuery()   )
        {
            while (rs.next()) {
               Student student = new Student(rs.getString("personId"), rs.getString("fullName"), rs.getString("number"), rs.getInt("yearOfBirth"), rs.getString("major"), rs.getInt("yearOfAdmission"), rs.getDouble("entranceEnglishScore"));
               studentList.add(student);
            }
    }
     return studentList;
    }
    
}
