<%@page import="controller.DatabaseModify"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <title>up9cloud.net - 九天之上 | Minecraft 麥塊 - 繁體中文私服</title>
        <base target="_self" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="http://code.jquery.com/jquery-latest.min.js" type="text/javascript"></script>
        <link href="/resource/CSS/login.css" rel="stylesheet" type="text/css">
        <!--<script src="/resource/js/login.usage.js" type="text/javascript"></script>-->
    </head>

    <body>
        <div class="container">
            <div id="signin">
                <div class="tabs">
                    <p><a>登入</a></p>
                </div>
                <br>
                <div class="tab_container">
                    <div class="header">
                        <div class="sep"></div><br>
                        <p>請輸入使用者名稱與密碼：</p>
                    </div>
                    <div class="important" name="tips0">${tips0}</div>
                    <form name="loginform" action="login.do" method="post">
                        <div class="inputs">
                            <input type="text" name="email" placeholder="請輸入信箱"/><br>
                            <input type="password" name="password" placeholder="請輸入密碼"/><br>
                            <input type="hidden" name="session" value="<%out.println(session.getId());%>">
                            <input id="submit" type="submit" value="登入"/>
                        </div>
                    </form>
                    <!--<%
                        out.println("Session ID：" + session.getId());
                        if (DatabaseModify.getSelectColumnValue1() != null) {
                            out.println(DatabaseModify.getSelectColumnValue1() + " " + DatabaseModify.getSelectColumnValue2());
                        };
                    %>-->
                </div>
            </div>
        </div>
    </body>
</html>