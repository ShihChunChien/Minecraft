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
                    -----------------------------------------------<br>
                    您帳號前面有加上: <jsp:getProperty name="resbean" property="usernamePrefix" /><br>
                    請使用下方"完整"的帳號登入！<br>
                    若喜歡此遊戲，請支持正版！<br>
                    -----------------------------------------------<br>
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