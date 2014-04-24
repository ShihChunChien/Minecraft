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

public class LoginAction extends SimpleFormController {

    public static String tipsout;
    private String urlString;

    @Override
    protected ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command, BindException errors) throws Exception {
        LoginForm loginForm = (LoginForm) command;

        String email = loginForm.getEmail();
        String password = loginForm.getPassword();

//        String ip = GetIp.getClientIpAddr();
//        System.out.println(status);
//        System.out.println(email);
//        System.out.println(usernamePrefix);
//        System.out.println(username);
//        System.out.println(password);
//        System.out.println(sex);            
        OfficialCheck.setEmail(email);
        OfficialCheck.setPassword(password);

        if (OfficialCheck.officialCheck()) {//正版帳號檢查通過

            DatabaseModify databaseModify = new DatabaseModify();
            DatabaseModify.setDBname("Account");
            DatabaseModify.setTablename("users");
            DatabaseModify.setMethod("select");
            String[][] SelectColumnValue = {
                {"email", email},
                {"password", Encode.md5(password)}};

            DatabaseModify.setSelectColumnValue(SelectColumnValue);

            if (databaseModify.select()) {//已註冊                
                HttpSession session = request.getSession();
                String UserSession = session.getId(); //取得session值
                String ip = request.getRemoteAddr(); //取得client IP
                session.setAttribute("UserSession", UserSession);
                session.setAttribute("UserName", OfficialCheck.getResultUsername());

                return new ModelAndView(this.getSuccessView(), "user", "HI! " + session.getAttribute("UserName"));
            } else {//未註冊

                DatabaseModify.setDBname("Account");
                DatabaseModify.setTablename("users");
                DatabaseModify.setMethod("INSERT");
                String username = OfficialCheck.getResultUsername();
                String[][] columnValue = {
                    {"status", "1"},
                    {"username", username},
                    {"password", Encode.md5(password)},
                    {"email", email},};
                DatabaseModify.setColumnValue(columnValue);

                if (databaseModify.insert()) {//寫入成功              
                    //loginForm.setUsernameOut(usernamePrefix, username);
                    //loginForm.setPasswordOut(password);
                    HttpSession session = request.getSession();
                    String UserSession = session.getId(); //取得session值
                    String ip = request.getRemoteAddr(); //取得client IP
                    session.setAttribute("UserSession", UserSession);
                    session.setAttribute("UserName", OfficialCheck.getResultUsername());

                    return new ModelAndView(this.getSuccessView(), "user", "HI! " + session.getAttribute("UserName"));
                }
            }

        } else {//正版帳號檢查失敗

            DatabaseModify databaseModify = new DatabaseModify();
            DatabaseModify.setDBname("Account");
            DatabaseModify.setTablename("users");
            DatabaseModify.setMethod("select");
            String[][] SelectColumnValue = {
                {"username", email},
                {"password", Encode.md5(password)}};

            DatabaseModify.setSelectColumnValue(SelectColumnValue);

            if (databaseModify.select()) {//已註冊
                tipsout = "登入成功!";
                DatabaseModify.setDBname("Account");
                DatabaseModify.setTablename("users");
                DatabaseModify.setMethod("select");
                String[][] GetEmailColumnValue = {
                    {"email", email}};
                DatabaseModify.setGetEmailColumnValue(GetEmailColumnValue);
                //loginForm.setUsernameOut(usernamePrefix, username);
                //loginForm.setPasswordOut(password);
                HttpSession session = request.getSession();
                String UserSession = session.getId(); //取得session值
                String ip = request.getRemoteAddr(); //取得client IP
                session.setAttribute("UserSession", UserSession);                
                session.setAttribute("UserName", email);
                session.setAttribute("UserEmail", DatabaseModify.GetEmail());
                session.setAttribute("UserPassword", Encode.md5(password));
                return new ModelAndView(this.getSuccessView(), "user", "HI! " + session.getAttribute("UserName"));
            } else {//未註冊
                response.sendRedirect("/register.htm");
                //return new ModelAndView(this.getFormView(),"user","456");
            }
        }
        return new ModelAndView(this.getFormView(), "user", "登錄失敗");
    }
}
