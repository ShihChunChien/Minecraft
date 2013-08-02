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

public class RegisterAction extends SimpleFormController {public static String tipsout;
    protected ModelAndView onSubmit(Object command) throws Exception { 
       RegisterForm form = (RegisterForm) command; 
       Stringchk regexobj = new Stringchk();
       String regex = regexobj.regex();      
       
       
       //if(regexobj.regex() == "false"){tipsout="帳號格式錯誤";}else if(form.official() == "Bad login"){tipsout="您的帳號為非正版";}else if(form.main() != null){tipsout = form.main();}
      
         /*if(form.main() == null){
             if(strchk == "false"){tipsout="帳號格式錯誤";}
             else if(officialtip == "Bad login"){tipsout="您的帳號為非正版";}
         }else{tipsout = form.main();}*/
       
       if((!"Bad login".equals(form.official()) || "0".equals(form.getStatus())) && ("true".equals(regex) && form.main() == null))
       {
          //String test = form.official();
          return new ModelAndView(this.getSuccessView(),"user", form.main());
       } 
       else{ 
            if(form.main() != null){tipsout = form.puttips;}
            else if("false".equals(regex)){tipsout = "帳號格式錯誤";}
            else if("Bad login".equals(form.official())){tipsout = "您的帳號為非正版";}
            
            return new ModelAndView(this.getFormView(),"tips", tipsout);
       }
    }
}