/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author Vincent
 */
import java.util.Iterator;
import org.hibernate.Query;
import org.hibernate.HibernateException;  
import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.cfg.Configuration;  
import org.hibernate.service.ServiceRegistry;  
import org.hibernate.service.ServiceRegistryBuilder;   

public class HibernateDemo {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSession(); 
        
        // 使用HQL建立查詢
        Query query = session.createQuery("from User");
        Iterator users = query.list().iterator();
        System.out.println("id \t username/password");
        while(users.hasNext()) {
            User user = (User) users.next(); 
            System.out.println(user.getId() +
                    " \t " + user.getUsername() +
                    "/" + user.getPassword()); 
        }
 
        System.out.println();
 
        // 使用HQL建立查詢
        query = session.createQuery("from User where id = 1");
        // 設定查詢參數
        //query.setParameter(0, "id");
        users = query.list().iterator();
        System.out.println("id \t username/password");
        while(users.hasNext()) {
            User user = (User) users.next(); 
            System.out.println(user.getId() +
                                " \t " + user.getUsername() +
                                "/" + user.getPassword()); 
        }
        System.out.println(HibernateUtil.getSession());
        System.out.println(LoginForm.getUsername());
        session.close();
        
        HibernateUtil.closeSession(session);
    }
}