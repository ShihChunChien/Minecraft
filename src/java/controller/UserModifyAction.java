/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author Vincent
 */
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.mvc.SimpleFormController;
import org.springframework.web.servlet.*;

public class UserModifyAction extends SimpleFormController {

    public static String tipsout;

    @Override
    protected ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command, BindException errors) throws Exception {
        UserModifyForm usermodifyForm = (UserModifyForm) command;

        String email = usermodifyForm.getEmail();
        String oldpassword = usermodifyForm.getOldPassword();
        String newpassword = usermodifyForm.getNewPassword();
        String rechkpassword = usermodifyForm.getReChkPassword();
        HttpSession session = request.getSession();
        //session.setAttribute("pwdSession", oldpassword); //test
        //OfficialCheck.setEmail(email);
        //OfficialCheck.setPassword(password);
        if (oldpassword != null) {//欲修改密碼
            if (oldpassword == session.getAttribute("UserPassword")) { //舊密碼與資料庫相符
                if (newpassword.equals(rechkpassword)) { //新密碼輸入檢查通過
                    DatabaseModify databaseModify = new DatabaseModify();
                    DatabaseModify.setDBname("Account");
                    DatabaseModify.setTablename("users");
                    DatabaseModify.setMethod("update");
                    String[][] UserModifyColumnValue = {
                        {"email", email},
                        {"password", Encode.md5(newpassword)}};
                    
                    String UserModifyUsername = (String) session.getAttribute("UserName");
                    
                    DatabaseModify.setUserModifyColumnValue(UserModifyColumnValue);
                    DatabaseModify.setUserModifyUsername(UserModifyUsername);
                    if (databaseModify.UserModify()) {
                        return new ModelAndView(this.getSuccessView(), "user", "修改成功pwd---" +oldpassword);
                    } else {
                        return new ModelAndView(this.getFormView(), "user", "修改失敗pwd---" + oldpassword);
                    }
                }
            }

        } else {//欲修改密碼
            
            DatabaseModify databaseModify = new DatabaseModify();
            DatabaseModify.setDBname("Account");
            DatabaseModify.setTablename("users");
            DatabaseModify.setMethod("update");
            String[][] UserModifyColumnValue = {
                {"email", email}};
            
            DatabaseModify.setUserModifyColumnValue(UserModifyColumnValue);
            String UserModifyUsername = (String) session.getAttribute("UserName");
            if (databaseModify.UserModify()) {
                return new ModelAndView(this.getSuccessView(), "user", "修改成功mail---" + oldpassword);
            } else {
                return new ModelAndView(this.getFormView(), "user", "修改失敗mail---" + oldpassword);
            }
            
        }
        return new ModelAndView(this.getFormView(), "user", "修改失敗");
    }
}
