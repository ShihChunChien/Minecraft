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
    protected ModelAndView onSubmit(Object command) throws Exception { 
       RegisterForm form = (RegisterForm) command; 
        
      /* if("123456".equals(form.getUsername()) && "123456".equals(form.getPassword())) */
       if(!"Bad login".equals(form.official()) || "0".equals(form.getStatus()))
       {
          //String test = form.official();
          return new ModelAndView(this.getSuccessView(),"user", form.main());
       } 
       else{ 
          return new ModelAndView(this.getFormView());
       }
    }
}