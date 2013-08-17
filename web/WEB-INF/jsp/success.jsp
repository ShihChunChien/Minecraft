<%@page import="controller.RegisterForm"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html> 
    <head>
        <title>up9cloud.net - 九天之上 | Minecraft 麥塊 - 繁體中文私服</title>
    </head> 
    <body>
        <jsp:useBean id="resbean" class="controller.RegisterForm" scope="request"/>
        <h1>註冊成功！</h1>
        <%if (RegisterForm.status.equals("1")) {%>
        注意！<br>
        您的帳號有加上前綴字: <span style="color:#b22222;"><jsp:getProperty name="resbean" property="usernamePrefix" /></span><br>
        登入時請注意帳號正確性<br>
        <%}%>
        <br>
        帳號: <jsp:getProperty name="resbean" property="usernameOut" /><br>
        <%if (RegisterForm.status.equals("1")) {%>
        信箱: <jsp:getProperty name="resbean" property="email" /><br>
        <%}%>
        密碼: <jsp:getProperty name="resbean" property="passwordOut" /><br>
        <div align="right"><input type="button" value="回首頁" onClick="window.top.location.href = 'index.html';"></div>
    </body>
</html>