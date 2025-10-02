/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week_4.DAO;
import java.sql.*;
import DatabaseConnection.Week4_Connection;
import java.util.ArrayList;
import java.util.List;
import week_4.model.Teacher;
/**
 *
 * @author Admin
 */
public class TeacherDAO {
    public boolean add(Teacher teacher) throws SQLException {
        String sql = "{call dbo.Teacher_Insert(?,?,?,?,?,?,?,?)}";
        try (Connection con = Week4_Connection.Week4_Connection() ;
             CallableStatement cs = con.prepareCall(sql)){
            cs.setString(1, teacher.getID());
            cs.setString(2, teacher.getFullName());
            cs.setString(3, teacher.getNumber());
            cs.setInt(4, teacher.getYearOfBirth());
            cs.setString(5,teacher.getMajor());
            cs.setInt(6,teacher.getYearInProfession());
            cs.setString(7, teacher.getContactType());
            cs.setDouble(8, teacher.getSalaryCoeffcient());
            return cs.execute();
        }
    }
    public ArrayList<Teacher> getAll() throws SQLException {
        ArrayList<Teacher> teacherList = new ArrayList<>();String sql =
        "SELECT p.ID AS personId, " +
        "       TRIM(p.FullName) AS fullName, " +
        "       TRIM(p.Number) AS number, " +
        "       p.YearOfBirth AS yearOfBirth, " +
        "       TRIM(p.Major) AS major, " +
        "       t.yearInProfession AS yearInProfession, " +
        "       TRIM(t.contractType) AS contractType, " +
        "       t.salaryCoefficient AS salaryCoefficient " +
        "FROM Teachers t INNER JOIN Persons p ON t.ID = p.ID;";

          try (Connection con = Week4_Connection.Week4_Connection() ;
              PreparedStatement pst = con.prepareStatement(sql);
              ResultSet rs = pst.executeQuery()   )
        {
            while (rs.next()) {
                Teacher teacher = new Teacher(rs.getString("personID"),rs.getString("fullName"),rs.getString("number"), 
               rs.getInt("yearOfBirth"), rs.getString("major"), rs.getInt("yearInProfession"), rs.getString("contractType"), rs.getDouble("salaryCoefficient"));
                teacherList.add(teacher);
        }
    }
     return teacherList;
    }
    public static void main(String[] args) throws SQLException {
        TeacherDAO main = new TeacherDAO();
        for (Teacher teacher : main.getAll()) {
            System.out.println(teacher);
        }
    }
    
}
