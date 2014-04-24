<%@page import="controller.DatabaseModify"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>up9cloud.net - 九天之上 | Minecraft 麥塊 - 繁體中文私服</title>
    </head>

    <body>        
        <form name="usermodifyform" action="usermodify.do" method="post">
            <br>
            帳號：<% out.println(session.getAttribute("UserName"));%><br>
            舊密碼：<input type="text" name="oldpassword"/><br>
            輸入新密碼：<input type="text" name="newpassword"/><br>
            確認新密碼：<input type="text" name="rechkpassword"/><br>
            信箱：<input type="text" name="email" value="<% out.println(session.getAttribute("UserEmail"));%>"/><br>
            <input type="submit" value="確定"/>
        </form>        
    </body>
</html>