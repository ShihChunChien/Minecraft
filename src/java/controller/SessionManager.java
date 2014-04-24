/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author Vincent
 */

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
 
public class SessionManager extends HttpServlet {
   public static String sessionshow; 
   @Override
   public void service(HttpServletRequest request, HttpServletResponse response)
               throws IOException, ServletException {
       
       
      
      HttpSession session = request.getSession();    
      sessionshow = session.getId();
      
    
   }public static void main(String[] args) {
       
       SessionManager sessiontest = new SessionManager();  
       sessionshow = sessiontest.getServletInfo();
       System.out.println(SessionManager.sessionshow);
   }
}
