<%@page import="controller.RegisterForm"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="resbean" class="controller.RegisterForm" scope="request"/>
<!DOCTYPE HTML>
<html> 
    <head>
        <title>up9cloud.net - 九天之上 | Minecraft 麥塊 - 繁體中文私服</title>
        <link href="/resource/CSS/register.css" rel="stylesheet" type="text/css">
        <base target="_self" />
    </head> 
    <body>
        <div class="container">
            <div id="signup">
                <div class="tabs">
                    <h1>註冊成功！</h1>
                </div>
                <div class="sep"></div>
                <%if (RegisterForm.status.equals("0")) {%>
                <div class="important">
                    注意！<br>
                    您的帳號有加上前綴字:<br>
                    <div class="result"><jsp:getProperty name="resbean" property="usernamePrefix" /></div>
                    登入時請注意帳號正確性<br>
                </div>
                    <br>
                <%}%>
                帳號: <div class="result"><jsp:getProperty name="resbean" property="usernameOut" /></div>
                <%if (RegisterForm.status.equals("1")) {%>
                信箱: <div class="result"><jsp:getProperty name="resbean" property="email" /></div>
                <%}%>
                密碼: <div class="result"><jsp:getProperty name="resbean" property="passwordOut" /></div>
                <botton id="back" onClick="window.top.location.href = 'index.html';">確認</botton>
            </div>
        </div>
    </body>
</html>