/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author Vincent
 */
import java.sql.*; 
 
public class DBConnectionDemo { 
    public static void main(String[] args) { 
        String driver = "com.mysql.jdbc.Driver"; 
        String url = "jdbc:mysql://173.1.15.169:3306/Account"; 
        String user = "webapps"; 
        String password = "123456"; 
        try { 
            Class.forName(driver); 
            Connection conn = 
               DriverManager.getConnection(url, 
                                  user, password);
 
            if(conn != null && !conn.isClosed()) {
                System.out.println("資料庫連線測試成功！");
                System.out.println(encryption.outmd5pwd);
                //System.out.println(Test1.sqltest());
                conn.close();
            }
            
        } 
        catch(ClassNotFoundException e) { 
            System.out.println("找不到驅動程式類別");            
            e.printStackTrace(); 
        } 
        catch(SQLException e) { 
            e.printStackTrace(); 
        }
        RegisterForm testo = new RegisterForm();
        System.out.print(testo.getEmail());
    } 
}