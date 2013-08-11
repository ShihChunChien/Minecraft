/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author Vincent
 */
public class RegisterForm {

    public static String status;
    private static String email;
    private static String usernamePrefix;
    private static String username;
    private static String usernameOut;
    private static String nickname;
    private static String password;
    private static String passwordOut;
    private static String sex;

    public void setStatus(String status) {
        RegisterForm.status = status;
    }

    public void setEmail(String email) {
        RegisterForm.email = email;
    }

    public void setUsernamePrefix(String usernamePrefix) {
        RegisterForm.usernamePrefix = usernamePrefix;
    }

    public void setUsername(String username) {
        RegisterForm.username = username;
    }
    
    public void setUsernameOut(String usernamePrefix,String username){
        RegisterForm.usernameOut=usernamePrefix+username;
    }

    public void setNickname(String nickname) {
        RegisterForm.nickname = nickname;
    }

    public void setPassword(String password) {
        RegisterForm.password = password;
    }

    public void setPasswordOut(String password) {
        if (password == null) {
            System.out.print("password帶入null");
        } else {
            RegisterForm.passwordOut = String.valueOf(password.charAt(0));
            for (int i = 1; i < password.length(); i++) {
                passwordOut += "*";
            }
        }
    }

    public void setSex(String sex) {
        RegisterForm.sex = sex;
    }

    public String getStatus() {
        return status;
    }

    public String getEmail() {
        return email;
    }

    public String getUsernamePrefix() {
        return usernamePrefix;
    }

    public String getUsername() {
        return username;
    }
    
    public String getUsernameOut(){
        return usernameOut;
    }

    public String getNickname() {
        return nickname;
    }

    public String getPassword() {
        return password;
    }

    public String getPasswordOut() {
        return passwordOut;
    }

    public String getSex() {
        return sex;
    }

    public static String tabreset(String tableType) {//tab1,tab2
        return tableType;
    }
}