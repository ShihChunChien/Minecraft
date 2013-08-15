package controller;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Vincent
 */
public class Encode {

    public static String outmd5pwd;

    public static String md5(String pwdin) {
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

    public static String SHA256(String str) throws Exception {

        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(str.getBytes());

        byte byteData[] = md.digest();

        //convert the byte to hex format method 1
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < byteData.length; i++) {
            sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
        }

        return sb.toString();

        //convert the byte to hex format method 2
//        StringBuilder hexString = new StringBuilder();
//        for (int i = 0; i < byteData.length; i++) {
//            String hex = Integer.toHexString(0xff & byteData[i]);
//            if (hex.length() == 1) {
//                hexString.append('0');
//            }
//            hexString.append(hex);
//        }
//        return hexString.toString();
    }
}