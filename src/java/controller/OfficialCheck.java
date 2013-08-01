/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author Vincent
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class OfficialCheck
{
public static String user = "sshiuan2@gmail.com";
public static String pass = "Aa12341234";
private static String inputLine;
private static String strtest;
public static void main(String[] args) {
  try {
  
   URL google = new URL("http://login.minecraft.net/?user=" + user + "&password=" + pass + "&version=13");
   URLConnection yc = google.openConnection();
   BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
   strtest =in.readLine();
   //while ((inputLine = in.readLine()) != null) {
   //     System.out.println(inputLine);
   //}
   System.out.println(strtest);
   in.close();
    String s = strtest;   
        String a[] = s.split(":");  
      
        System.out.println(a[0]);  
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        System.out.println(a[4]);
        System.out.println(OfficialCheck.strtest);
  } catch (Exception e) {
   e.printStackTrace();
  }
}
}
