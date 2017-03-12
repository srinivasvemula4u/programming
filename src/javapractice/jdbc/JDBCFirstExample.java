/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author srivemul
 */
public class JDBCFirstExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String url = "jdbc:Derby://localhost:1527/EmployeeDB";
        String userName = "public";
        String passWord = "tiger";
        String query = "select * from Employee";
        try (Connection con = DriverManager.getConnection(url, userName,passWord);
                Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
                ResultSet resultSet = stmt.executeQuery(query);) {
            while(resultSet.next()) {
                int EmpID = resultSet.getInt("ID");
                String firstName = resultSet.getString("FirstName");
                String lastName = resultSet.getString("LastName");
                Float salary = resultSet.getFloat("Salary");
                Date birthDate = resultSet.getDate("BirthDate");
                System.out.println(EmpID + " " + firstName + " "+lastName + " "+ salary + " "+ birthDate);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(JDBCFirstExample.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
