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
public class StringCheck {

    public final static String patternMail = "^([\\w-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([\\w-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$";
    public final static String patternUsername = "^[A-Za-z0-9]{4,12}$";
    public final static String[] patternUsernamePrefix = {"sp-", "up9cloud-"};

//    public static void main(String[] args) {
//        System.out.println(patternMail);
//        System.out.println(patternUsername);
//        System.out.println(patternUsernamePrefix);
//    }
    public static boolean mailCheck(String mail) {
        boolean flag = false;
        if (mail == null) {
        } else {
            Pattern pattern = Pattern.compile(patternMail);
            Matcher matcher = pattern.matcher(mail);
            flag = matcher.matches();
        }
        return flag;
    }

    public static boolean usernameCheck(String username) {
        boolean flag = false;
        if (username == null) {
        } else {
            Pattern pattern = Pattern.compile(patternUsername);
            Matcher matcher = pattern.matcher(username);
            flag = matcher.matches();
        }
        return flag;
    }

    public static boolean usernamePrefixCheck(String prefix) {
        boolean flag = false;
        if (prefix == null) {
        } else {
            for (int i = 0; i < patternUsernamePrefix.length; i++) {
                if (prefix.equals(patternUsernamePrefix[i])) {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public static boolean passwordCheck(String password) {
        boolean flag = false;
        if (password == null) {
        } else if (4 > password.length()) {
        } else if (12 < password.length()) {
        } else {
            flag = true;
        }
        return flag;
    }
}
