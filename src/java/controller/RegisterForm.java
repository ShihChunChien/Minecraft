/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.sql.DataSource;
/**
 *
 * @author Vincent
 */

public class RegisterForm {
    private static String status;
    private static String email;
    private static String username;
    private static String nickname;    
    private static String password;
    private static String sex;
    private static String inputLine;
    public static String id;
    
    public void setStatus(String status) { 
       this.status = status; 
    }
    
    public void setEmail(String email) { 
       this.email = email; 
    }
    
    public void setUsername(String username) { 
       this.username = username; 
    }
    
     public void setNickname(String nickname) { 
       this.nickname = nickname; 
    }
    
    public void setPassword(String password) { 
       this.password = password; 
    }
    
     public void setSex(String sex) { 
       this.sex = sex; 
    }
    
    public String getStatus() { 
       return status; 
    }
     
    public String getEmail() { 
       return email; 
    } 
     
    public String getUsername() { 
       return username; 
    }
    
     public String getNickname() { 
       return nickname; 
    } 
    
    public String getPassword() { 
       return password; 
    }
    
    public String getSex() { 
       return sex; 
    }
    
    public static String official(){
        try {  
   URL google = new URL("http://login.minecraft.net/?user=" + username + "&password=" + password + "&version=13");
   URLConnection yc = google.openConnection();
   BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
   
   inputLine = in.readLine(); 
   System.out.println(inputLine);  
   in.close(); 
  } catch (Exception e) {
   e.printStackTrace();
  }  
  return inputLine;
}  
  public String doGet(HttpServletRequest request)throws ServletException, IOException{
  HttpSession session = request.getSession();
  id = session.getId();
  System.out.println("Session Id is : " + id);  
        return id;
  }
  
public String main() throws ClassNotFoundException {
    String sqltest = null;
    String driver = "com.mysql.jdbc.Driver"; 
    String dburl = "jdbc:mysql://173.1.15.169:3306/Account"; 
    String dbuser = "webapps"; 
    String dbpassword = "123456";
  try {      
  Class.forName(driver);
  Connection conn = DriverManager.getConnection(dburl, dbuser, dbpassword); 
  Statement constat = conn.createStatement();
  //String qry1 = "INSERT INTO sells VALUES ('win','wine',123)";
  if("1".equals(getStatus())){        
       int insert = constat.executeUpdate( "insert into users(status, password ,sex ,email)" + " VALUES ('1', '"+password+"' ,'"+sex+"' ,'"+email+"') ") ;
       }
  if("0".equals(getStatus())){        
       int insert = constat.executeUpdate( "insert into users(status, username, password ,sex)" + " VALUES ('0', '"+username+"', '"+password+"' ,'"+sex+"') ") ;
       }
      //System.out.println(insert);
       // retrieve a list of three random cities
     // System.out.println(result.getString("username")); 
    //while(result.next()) { 
    //sqltest = result.getString("username");
    //System.out.println(result.getString("username"));
//}
  conn.close();
} catch (SQLException ex) {
    // something has failed and we print a stack trace to analyse the error
    ex.printStackTrace();
    // ignore failure closing connection    
}     
        return null;
}  
}