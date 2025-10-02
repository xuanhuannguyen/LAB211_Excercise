/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DatabaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class  Week4_Connection {

    public static Connection Week4_Connection() {
        Connection conn = null;
        try {
            String url = "jdbc:sqlserver://localhost:1433;"
                    + "databaseName=PersonManagement;"
                    + "encrypt=true;trustServerCertificate=true;";
            String user = "xuanhuan"; 
            String password = "21102005";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(url, user, password);
   
        } catch (ClassNotFoundException e) {
            System.out.println("Không tìm thấy JDBC Driver!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Lỗi kết nối SQL Server!");
            e.printStackTrace();
        }
        return conn;
    }
}