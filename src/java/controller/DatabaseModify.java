package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ChiaHsuan
 */
public class DatabaseModify {

    private static final String host;

    static {
        host = "10.0.0.200";
    }
//    private final String host = "localhost";
    private static final String port;

    static {
        port = "3306";
    }
    private static String dbname;
    private static String tablename;
    private static final String user;

    static {
        user = "webapps";
    }
    private static final String password;

    static {
        password = "sppabew";
    }
    private static final String driver;

    static {
        driver = "com.mysql.jdbc.Driver";
    }
    private final String dburl = "jdbc:mysql://" + host + ":" + port + "/" + dbname;

    //static {
    //    dburl = "jdbc:mysql://" + host + ":" + port + "/" + dbname;
    //}
    private static String method;
    private static String column;
    private static String value;
    private static String SelectColumn;
    private static String SelectValue;
    private static String GetEmailValue;
    private static String GetEmailColumn;
    private static String UserModifyValue;
    private static String UserModifyColumn;
    private static String UserModifyUsername;

    private static String SetScript = "";
    private static String WhereScript = "";
    public String errorMessage;
    private static int errorCode;

    private static Connection conn;

    protected static void setDBname(String dbname) {
        DatabaseModify.dbname = dbname;
    }

    protected static void setTablename(String tablename) {
        DatabaseModify.tablename = tablename;
    }

    protected static void setMethod(String method) {
        DatabaseModify.method = method;
    }

    protected static void setColumnValue(String[][] columnValue) {
        column = '`' + columnValue[0][0] + '`';
        value = '"' + columnValue[0][1] + '"';
        for (int i = 1; i < columnValue.length; ++i) {
            column += ",`" + columnValue[i][0] + '`';
            value += ",\"" + columnValue[i][1] + '"';
        }
    }

    protected static void setSetScript(String script) {
        SetScript = script;
    }

    protected static void addSetScript(String script) {
        SetScript += "," + script;
    }

    protected static void setSetScripts(String[][] columnValue) {
        SetScript += ",`" + columnValue[0][0] + '`' + '=' + ",\"" + columnValue[0][1] + '"';
        for (int i = 1; i < columnValue.length; ++i) {
            SetScript += ",`" + columnValue[i][0] + '`' + '=' + ",\"" + columnValue[i][1] + '"';
        }
    }

    protected static void resetSetScripts() {
        SetScript = "";
    }

    protected static void setWhereScript(String script) {
        WhereScript = script;
    }

    protected static void addWhereScript(String script) {
        WhereScript += "," + script;
    }

    protected static void setWhereScripts(String[][] columnCompareValue) {
        WhereScript += ",`" + columnCompareValue[0][0] + '`' + columnCompareValue[0][1] + ",\"" + columnCompareValue[0][2] + '"';
        for (int i = 1; i < columnCompareValue.length; ++i) {
            WhereScript += ",`" + columnCompareValue[i][0] + '`' + columnCompareValue[i][1] + ",\"" + columnCompareValue[i][2] + '"';
        }
    }

    protected static void resetWhereScript() {
        SetScript = "";
    }

    protected static void setSelectColumnValue(String[][] SelectColumnValue) {
        SelectColumn = '`' + SelectColumnValue[0][0] + '`';
        SelectValue = "'" + SelectColumnValue[0][1] + "'";
        for (int i = 1; i < SelectColumnValue.length; ++i) {
            SelectColumn += ",`" + SelectColumnValue[i][0] + '`';
            SelectValue += ",'" + SelectColumnValue[i][1] + "'";
        }
    }

    protected static void setGetEmailColumnValue(String[][] GetEmailColumnValue) {
        GetEmailColumn = '`' + GetEmailColumnValue[0][0] + '`';
        GetEmailValue = "'" + GetEmailColumnValue[0][1] + "'";
        for (int i = 1; i < GetEmailColumnValue.length; ++i) {
            GetEmailColumn += ",`" + GetEmailColumnValue[i][0] + '`';
            GetEmailValue += ",'" + GetEmailColumnValue[i][1] + "'";
        }
    }

    protected static void setUserModifyColumnValue(String[][] UserModifyColumnValue) {
        UserModifyColumn = '`' + UserModifyColumnValue[0][0] + '`';
        UserModifyValue = "'" + UserModifyColumnValue[0][1] + "'";
        for (int i = 1; i < UserModifyColumnValue.length; ++i) {
            UserModifyColumn += ",`" + UserModifyColumnValue[i][0] + '`';
            UserModifyValue += ",'" + UserModifyColumnValue[i][1] + "'";
        }
    }

    protected static void setUserModifyUsername(String UserModifyUsername) {
        DatabaseModify.UserModifyUsername = UserModifyUsername;
    }

    protected static void setErrorCode(int code) {
        errorCode = code;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public boolean insert() throws ClassNotFoundException {
        String sql = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(dburl, user, password);
            Statement constat = conn.createStatement();

            sql = method + " INTO `" + dbname + "`.`" + tablename + "` " + "(" + column + ")" + " VALUES (" + value + ");";

            constat.executeUpdate(sql);
            conn.close();

        } catch (SQLException sqle) {
            System.out.println("SQLErrorCode :" + sqle.getErrorCode());
            System.out.println("SQLMessage :" + sqle.getMessage());
            System.out.printf("SQLStatment :" + sql);
            return false;
        }
        return true;
    }

    public boolean update() {
        //DatabaseModify.setMethod("UPDATE");
        String sql = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(dburl, user, password);
            Statement constat = conn.createStatement();

            sql = method + "`" + dbname + "`.`" + tablename + "` SET " + SetScript + " WHERE" + WhereScript + ";";

            constat.executeUpdate(sql);
            conn.close();
        } catch (ClassNotFoundException ex) {
            System.err.println(ex.getMessage());
        } catch (SQLException sqle) {
            System.out.println("SQLErrorCode :" + sqle.getErrorCode());
            setErrorCode(sqle.getErrorCode());
            System.out.println("SQLMessage :" + sqle.getMessage());
            System.out.printf("SQLStatment :" + sql);
            return false;
        }
        return true;
    }

    public boolean select() throws ClassNotFoundException {
        String sql = null;
        boolean flag = false;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(dburl, user, password);
            Statement constat = conn.createStatement();

            //sql = method + SelectColumn + " from `" + dbname + "`.`" + tablename + "` " + "where" + "(" + SelectColumn + ")=" + "(" + SelectValue + ");";
            sql = method + " " + SelectColumn + " from " + dbname + "." + tablename + " where" + "(" + SelectColumn + ")=" + "(" + SelectValue + ");";

            //sql = "select email,password from Account.users where (email,password) = ('sshiuan2@gmail.com','81dc9bdb52d04dc20036dbd8313ed055')";
            ResultSet select = constat.executeQuery(sql);
            select.last();
            int rowCount = select.getRow();
            if (rowCount == 1) {
                flag = true;
            } else {
                flag = false;
            }
            conn.close();

        } catch (SQLException sqle) {
            System.out.println("SQLErrorCode :" + sqle.getErrorCode());
            setErrorCode(sqle.getErrorCode());
            System.out.println("SQLMessage :" + sqle.getMessage());
            System.out.printf("SQLStatment :" + sql);
            return false;
        }
        return flag;
    }

    public static String GetEmail() throws ClassNotFoundException {
        String sql = null;
        String useremail = null;
        //boolean flag = false;
        try {
            Class.forName(driver);
            String dburl = "jdbc:mysql://" + host + ":" + port + "/" + dbname;
            conn = DriverManager.getConnection(dburl, user, password);
            Statement constat = conn.createStatement();

            //sql = method + SelectColumn + " from `" + dbname + "`.`" + tablename + "` " + "where" + "(" + SelectColumn + ")=" + "(" + SelectValue + ");";
            sql = method + " " + GetEmailColumn + " from " + dbname + "." + tablename + " where" + " " + "username=" + GetEmailValue;

            //sql = "select email,password from Account.users where (email,password) = ('sshiuan2@gmail.com','81dc9bdb52d04dc20036dbd8313ed055')";
            ResultSet GetEmail = constat.executeQuery(sql);

            while (GetEmail.next()) {
                useremail = GetEmail.getString("email");
            }

            conn.close();

        } catch (SQLException sqle) {
            System.out.println("SQLErrorCode :" + sqle.getErrorCode());
            setErrorCode(sqle.getErrorCode());
            System.out.println("SQLMessage :" + sqle.getMessage());
            System.out.printf("SQLStatment :" + sql);
            return sql + sqle.getMessage();
        }
        return useremail;
    }

    public boolean UserModify() throws ClassNotFoundException {
        String sql = null;
        //boolean flag = false;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(dburl, user, password);
            Statement constat = conn.createStatement();
            
            //sql = method + " " + SelectColumn + " from " + dbname + "." + tablename + " where" + "(" + SelectColumn + ")=" + "(" + SelectValue + ");";
            //sql = method +" "+ dbname +"."+ tablename +" set "+UserModifyColumn+"="+UserModifyValue+" where username="+"'sp-vincent'";
            sql = "update Account.users set" + UserModifyColumn + "=" + UserModifyValue +" where username="+"'sp-vincent'";
            //sql = "update Account.users set email = " + "'janblue.way@gmail.com'"+ "WHERE username =" + "'sp-vincent'";
            
            constat.executeUpdate(sql);            
            //if (UserModify != -1) {
            //    flag = true;
            //} else {
            //    flag = false;
            //}
            conn.close();

        } catch (SQLException sqle) {
            System.out.println("SQLErrorCode :" + sqle.getErrorCode());
            setErrorCode(sqle.getErrorCode());
            System.out.println("SQLMessage :" + sqle.getMessage());
            System.out.printf("SQLStatment :" + sql);
            return false;
        }
        return true;
    }
}
