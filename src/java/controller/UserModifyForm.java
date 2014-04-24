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
public class UserModifyForm {

    private static String email;
    private static String oldpassword;
    private static String newpassword;
    private static String rechkpassword;

    public void setEmail(String email) {
        UserModifyForm.email = email;
    }

    public void setOldPassword(String oldpassword) {
        UserModifyForm.oldpassword = oldpassword;
    }

    public void setNewPassword(String newpassword) {
        UserModifyForm.newpassword = newpassword;
    }

    public void setReChkPassword(String rechkpassword) {
        UserModifyForm.rechkpassword = rechkpassword;
    }

    public String getEmail() {
        return email;
    }

    public String getOldPassword() {
        return oldpassword;
    }

    public String getNewPassword() {
        return newpassword;
    }

    public String getReChkPassword() {
        return rechkpassword;
    }
}
