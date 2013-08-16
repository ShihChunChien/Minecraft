<%@page import="controller.RegisterForm"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html> 
    <head><title>Login Success</title></head> 
    <body>
        <jsp:useBean id="resbean" class="controller.RegisterForm" scope="request"/>
        <h1>恭喜您註冊成功！註冊資料如下：</h1><br>
        使用者名稱: <jsp:getProperty name="resbean" property="usernameOut" /><br>
        <%if (RegisterForm.status.equals("1")) {%>
        電子信箱: <jsp:getProperty name="resbean" property="email" /><br>
        <%}%>
        密碼: <jsp:getProperty name="resbean" property="passwordOut" />
        <div align="right"><input type="button" value="回首頁" onClick="window.top.location.href = 'index.htm';"></div>
    </body>
</html>