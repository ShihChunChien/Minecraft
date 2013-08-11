/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Vincent
 */
public class Stringchk {

    public static String outstring;
    public static String inputEmailStr;
    public static String inputUsernameStr;

    public static String regex() {
        RegisterForm resformobj = new RegisterForm();
        String emailin = resformobj.getEmail();
        String usernamein = resformobj.getUsername();

        System.out.println(emailin);
        System.out.println(usernamein);

        if (emailin == null) {
            inputEmailStr = "null";
        } else {
            inputEmailStr = emailin;
        }
        //String inputEmailStr = "null";
        String patternMailStr = "^([\\w-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([\\w-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$";
        Pattern patternMail = Pattern.compile(patternMailStr);
        Matcher matcherMail = patternMail.matcher(inputEmailStr);
        boolean matchMailFound = matcherMail.find();

        if (usernamein == null) {
            inputUsernameStr = "@null";
        } else {
            inputUsernameStr = usernamein;
        }
        //String inputUsernameStr = "@null";
        String patternUsernameStr = "^[A-Za-z0-9]+$";
        Pattern patternUsername = Pattern.compile(patternUsernameStr);
        Matcher matcherUsername = patternUsername.matcher(inputUsernameStr);
        boolean matchUsernameFound = matcherUsername.find();

        System.out.println(matchMailFound);
        System.out.println(matchUsernameFound);
        if (matchMailFound == true) {
            outstring = "true";
        } else if (matchUsernameFound == true) {
            outstring = "true";
        } else {
            outstring = "false";
        }

        /*------------------ output tester---------------------*/
        /* 
         while (matchMailFound) {
         System.out.println(matcherMail.start() + "-" + matcherMail.end());
         for (int i = 0; i <= matcherMail.groupCount(); i++) {
         String groupStr = matcherMail.group(i);
         System.out.println(i + ":" + groupStr);
         }
         if (matcherMail.end() + 1 <= inputEmailStr.length()) {
         matchMailFound = matcherMail.find(matcherMail.end());
         } else {
         break;
         }
         }

         while (matchUsernameFound) {
         System.out.println(matcherUsername.start() + "-" + matcherUsername.end());
         for (int i = 0; i <= matcherUsername.groupCount(); i++) {
         String groupStr = matcherUsername.group(i);
         System.out.println(i + ":" + groupStr);
         }
         if (matcherUsername.end() + 1 <= inputUsernameStr.length()) {
         matchUsernameFound = matcherUsername.find(matcherUsername.end());
         } else {
         break;
         }
         }*/
        return outstring;
    }

    public static void main(String[] args) {
        System.out.println(regex());
    }
}