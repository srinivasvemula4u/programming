/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice.jdbc;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

/**
 *
 * @author srivemul
 */
public class JDBCRowSetExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String url = "jdbc:oracle:thin:@//localhost:1521/pdborcl.oradev.oraclecorp.com";
        String userName = "hr";
        String passWord = "oracle";
        try(JdbcRowSet jdbcrs = RowSetProvider.newFactory().createJdbcRowSet();){
            jdbcrs.setUrl(url);
            jdbcrs.setUsername(userName);
            jdbcrs.setPassword(passWord);
            jdbcrs.setCommand("select * from Employees");
            jdbcrs.execute();
          while(jdbcrs.next()) {
              int EmpId = jdbcrs.getInt("ID");
              String firstName = jdbcrs.getString("FirstName");
              System.out.println(EmpId + " "+firstName);
          }
            
    }   catch (SQLException ex) {
            Logger.getLogger(JDBCRowSetExample.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
