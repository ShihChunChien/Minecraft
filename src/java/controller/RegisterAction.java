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

    protected ModelAndView onSubmit(Object command) throws Exception {
        RegisterForm form = (RegisterForm) command;
        Stringchk regexobj = new Stringchk();
        String regex = regexobj.regex();

        //if(regexobj.regex() == "false"){tipsout="帳號格式錯誤";}else if(form.official() == "Bad login"){tipsout="您的帳號為非正版";}else if(form.main() != null){tipsout = form.main();}
        /*if(form.main() == null){
         if(strchk == "false"){tipsout="帳號格式錯誤";}
         else if(officialtip == "Bad login"){tipsout="您的帳號為非正版";}
         }else{tipsout = form.main();}*/

        boolean regexCheckFlag;

        if ("false".equals(regex)) {
            regexCheckFlag = false;
        } else {
            regexCheckFlag = true;
        }

        String str = form.official();
        boolean legalCheck;

        if ("Bad login".equals(str)) {//搬去offcial check?
            legalCheck = false;
        } else if (str.length() > 20) {
            legalCheck = true;
        } else {
            legalCheck = true;
        }

        if ("1".equals(form.getStatus())) {//正版頁面
            if (!regexCheckFlag) {//格式檢查錯誤，以後要改寫列出不同檢查狀況
                tipsout = "帳號格式錯誤";
            } else {//格式正確
                if (!legalCheck) {//official check fail
                    tipsout = "正版帳號或密碼錯誤";
                } else {//official check ok
                    if (form.main() == null) {//寫入成功
                        return new ModelAndView(this.getSuccessView(), "user", form.main());
                    } else {//寫入失敗
                        tipsout = form.puttips;  //sql錯誤訊息比對
                    }
                }
            }
            return new ModelAndView(this.getFormView(), "tips1", tipsout);//預計跳回頁面並顯示錯誤訊息
        } else if ("0".equals(form.getStatus())) {//非正版頁面
            if (!regexCheckFlag) {//格式檢查錯誤，以後要改寫列出不同檢查狀況
                tipsout = "帳號格式錯誤";
            } else {//格式正確
                if (form.main() == null) {//寫入成功
                    return new ModelAndView(this.getSuccessView(), "user", form.main());
                } else {//寫入失敗
                    tipsout = form.puttips; //sql錯誤訊息比對
                }
            }
            return new ModelAndView(this.getFormView(), "tips0", tipsout);//預計跳回頁面並顯示錯誤訊息
        } else {//未知的頁面
            return new ModelAndView(this.getErrorView());
        }
    }

    private String getErrorView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
