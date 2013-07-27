/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Vincent
 */

public class LoginForm { 
    private static String username; 
    private static String password;   
    private String inputLine;
    public static String id;
    
    public void setUsername(String username) { 
       this.username = username; 
    } 
    
    public void setPassword(String password) { 
       this.password = password; 
    } 
    
    public static String getUsername() { 
       return username; 
    } 
    
    public String getPassword() { 
       return password; 
    }
    public String official(){
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
}