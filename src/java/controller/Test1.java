/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author Vincent
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.sql.DataSource;

public class Test1 {   

 public static String sqltest() { 
  String sqltest = null;
  try {      
  ApplicationContext context = new FileSystemXmlApplicationContext("/web/WEB-INF/applicationContext.xml");
  DataSource ds = (DataSource) context.getBean("dataSource");  
  ds = (DataSource)context.getBean("dataSource");  
  Connection conn;  
     conn = ds.getConnection();
  Statement sm = conn.createStatement();  
  int insert = sm.executeUpdate( "insert into users(status, username, nickname, password, sex ,email)" + " VALUES ('-1', 'testt5fewtgggfa', 'null', '35645964','1','your@email.com') ") ;
      // retrieve a list of three random cities
     // System.out.println(result.getString("username")); 
    //while(result.next()) { 
    //sqltest = result.getString("username");
    //System.out.println(result.getString("username"));
//}
            
} catch (SQLException ex) {
    // something has failed and we print a stack trace to analyse the error
    ex.printStackTrace();
    // ignore failure closing connection    
}
     return sqltest;
}
  public static void main(String[] args) {System.out.println(sqltest());}
}
  
  
  
 

