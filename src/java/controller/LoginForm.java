/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Vincent
 */
public class LoginForm {
   
    private static String email;   
    private static String password;   

    public void setEmail(String email) {
        LoginForm.email = email;
    }
   
    public void setPassword(String password) {
        LoginForm.password = password;
    }

    public String getEmail() {
        return email;    }

    public String getPassword() {
        return password;
    }   
  
}