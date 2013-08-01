/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Vincent
 */
public class Stringchk {
    public static void main(String[] args) {
    String inputStr = "ABCAB5321as@dfCABCd";
    String patternStr = "^[A-Za-z0-9@]+$";
    Pattern pattern = Pattern.compile(patternStr);
    Matcher matcher = pattern.matcher(inputStr);
    boolean matchFound = matcher.find();
     System.out.println(matchFound);
     
    while(matchFound) {
      System.out.println(matcher.start() + "-" + matcher.end());
      for(int i = 0; i <= matcher.groupCount(); i++) {
        String groupStr = matcher.group(i);
        System.out.println(i + ":" + groupStr);
      }
      if(matcher.end() + 1 <= inputStr.length()) {
        matchFound = matcher.find(matcher.end());
          }else{
            break;
          }
      }
  }    
}