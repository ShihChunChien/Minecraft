/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author Vincent
 */
import org.springframework.web.servlet.mvc.SimpleFormController;
import org.springframework.web.servlet.*;

public class RegisterAction extends SimpleFormController {

    public static String tipsout;

    @Override
    protected ModelAndView onSubmit(Object command) throws Exception {
        RegisterForm registerForm = (RegisterForm) command;

        String status = registerForm.getStatus();
        String email = registerForm.getEmail();
        String username = registerForm.getUsername();
        String usernamePrefix = registerForm.getUsernamePrefix();
        String password = registerForm.getPassword();
        String sex = registerForm.getSex();

        System.out.println(status);
        System.out.println(email);
        System.out.println(username);
        System.out.println(usernamePrefix);

        //if(regexobj.regex() == "false"){tipsout="帳號格式錯誤";}else if(form.official() == "Bad login"){tipsout="您的帳號為非正版";}else if(form.main() != null){tipsout = form.main();}
        /*if(form.main() == null){
         if(strchk == "false"){tipsout="帳號格式錯誤";}
         else if(officialtip == "Bad login"){tipsout="您的帳號為非正版";}
         }else{tipsout = form.main();}*/

        String str = RegisterForm.official();
        boolean legalCheck;

        if ("Bad login".equals(str)) {//搬去offcial check?
            legalCheck = false;
        } else if (str.length() > 20) {
            legalCheck = true;
        } else {
            legalCheck = true;
        }
        switch (status) {
            case "1"://正版注冊頁面
                if (!legalCheck) {//official check fail
                    tipsout = "正版帳號或密碼錯誤";
                } else {//official check ok

                    DatabaseModify databaseModify = new DatabaseModify();
                    DatabaseModify.setDBname("Account");
                    DatabaseModify.setTablename("users");
                    DatabaseModify.setMethod("insert");

                    String allstr = RegisterForm.official();
                    String oacstr[] = allstr.split(":");

                    System.out.println(oacstr[2]);

                    String[][] columnValue = {
                        {"status", status},
                        {"username", oacstr[2]},
                        {"password", encryption.md5()},
                        {"sex", sex},
                        {"email", email}
                    };
                    DatabaseModify.setColumnValue(columnValue);
                    boolean insertFlag = databaseModify.insert();

                    if (insertFlag == true) {//寫入成功
                        tipsout = "???";
                        return new ModelAndView(this.getSuccessView(), "user", tipsout);
                    } else {//寫入失敗
                        if (databaseModify.errorCode == 1062) {
                            databaseModify.errorMessage = "您註冊的帳號已被使用";
                        } else {
                            databaseModify.errorMessage = "註冊失敗";
                        }
                        tipsout = databaseModify.errorMessage; //sql錯誤訊息比對
                    }
                }
                return new ModelAndView(this.getFormView(), "tips1", tipsout);//預計跳回頁面並顯示錯誤訊息
            case "0"://非正版注冊頁面
                if (!StringCheck.usernameCheck(username)) {//格式檢查錯誤
                    tipsout = "帳號格式錯誤";
                } else if (!StringCheck.passwordCheck(password)) {
                    tipsout = "密碼要4~16位";
                } else if (!StringCheck.usernamePrefixCheck(usernamePrefix)) {
                    tipsout = "前綴字不合規定";
                } else {//格式正確

                    DatabaseModify databaseModify = new DatabaseModify();
                    DatabaseModify.setDBname("Account");
                    DatabaseModify.setTablename("users");
                    DatabaseModify.setMethod("insert");
                    String[][] columnValue = {
                        {"status", status},
                        {"username", username},
                        {"password", encryption.md5()},
                        {"sex", sex}
                    };
                    DatabaseModify.setColumnValue(columnValue);
                    boolean insertFlag = databaseModify.insert();

                    if (insertFlag == true) {//寫入成功
                        tipsout = "???";
                        return new ModelAndView(this.getSuccessView(), "user", tipsout);
                    } else {//寫入失敗
                        if (databaseModify.errorCode == 1062) {
                            databaseModify.errorMessage = "您註冊的帳號已被使用";
                        } else {
                            databaseModify.errorMessage = "註冊失敗";
                        }
                        tipsout = databaseModify.errorMessage; //sql錯誤訊息比對
                    }
                }
                return new ModelAndView(this.getFormView(), "tips0", tipsout);//預計跳回頁面並顯示錯誤訊息
            default://未知的頁面
                return new ModelAndView(this.getErrorView());
        }
    }

    private String getErrorView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
