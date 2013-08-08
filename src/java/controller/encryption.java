/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Vincent
 */
public class encryption {

    public static String outmd5pwd;

    public static String md5() {
        RegisterForm resformobj = new RegisterForm();
        String pwdin = resformobj.getPassword();
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(pwdin.getBytes());
            byte b[] = md.digest();
            int i;
            StringBuilder buf = new StringBuilder("");
            for (int offset = 0; offset < b.length; offset++) {
                i = b[offset];
                if (i < 0) {
                    i += 256;
                }
                if (i < 16) {
                    buf.append("0");
                }
                buf.append(Integer.toHexString(i));
            }

//System.out.println("result: " + buf.toString());
            outmd5pwd = buf.toString();
//System.out.println(outmd5pwd);
        } catch (NoSuchAlgorithmException e) {
// TODO Auto-generated catch block 
            e.printStackTrace();
        }
        return outmd5pwd;
    }
}
