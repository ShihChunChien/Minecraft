/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author Vincent
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class OfficialCheck {

    public static int officialVersion = 13;
    private static String email;
    private static String password;
    private static String result;
    private static String resultID;
    private static String resultType;
    private static String resultUsername;
    private static String resultSession;
    private static String resultPassword;

    protected static void setEmail(String email) {
        OfficialCheck.email = email;
    }

    protected static void setPassword(String password) {
        OfficialCheck.password = password;
    }

    protected static void setResult(String result) {
        OfficialCheck.result = result;
    }

    private static void setResultID(String resultID) {
        OfficialCheck.resultID = resultID;
    }

    private static void setResultType(String resultType) {
        OfficialCheck.resultType = resultType;
    }

    private static void setResultUsername(String resultUsername) {
        OfficialCheck.resultUsername = resultUsername;
    }

    private static void setResultSession(String resultSession) {
        OfficialCheck.resultSession = resultSession;
    }

    private static void setResultPassword(String resultPassword) {
        OfficialCheck.resultPassword = resultPassword;
    }

    private static String getEmail() {
        return email;
    }

    private static String getPassword() {
        return password;
    }

    protected static String getResult() {
        return result;
    }

    private static String getResultID() {
        return resultID;
    }

    private static String getResultType() {
        return resultType;
    }

    protected static String getResultUsername() {
        return resultUsername;
    }

    private static String getResultSession() {
        return resultSession;
    }

    private static String getResultPassword() {
        return resultPassword;
    }

    public static boolean officialCheck() {
        boolean resultFlag = false;
        try {
            URL google = new URL("https://login.minecraft.net/?user=" + email + "&password=" + password + "&version=" + officialVersion);
            URLConnection yc = google.openConnection();
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(
                    yc.getInputStream()));
            result = in.readLine();
            in.close();
            if (!"Bad login".equals(result) && result.length() > 32) {//檢查通過處理
                String splitResult[] = result.split(":");

                if (splitResult[4].length() != 32) {
                    throw new Exception("password md5出錯");
                } else {
                    resultFlag = true;
                    setResultID(splitResult[0]);
                    setResultType(splitResult[1]);
                    setResultUsername(splitResult[2]);
                    setResultSession(splitResult[3]);
                    setResultPassword(splitResult[4]);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(result);
        } finally {
            return resultFlag;
        }
    }
}