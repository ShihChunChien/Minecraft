<%@page import="controller.DatabaseModify"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>up9cloud.net - 九天之上 | Minecraft 麥塊 - 繁體中文私服</title>
    </head>

    <body>
        請輸入使用者名稱與密碼：<p>
        <form name="loginform" action="login.do" method="post">
            <br>
            帳號 <input type="text" name="email"/><br>
            密碼 <input type="password" name="password"/><br>
            <input type="hidden" name="session" value="<%out.println(session.getId());%>">
            <input type="submit" value="確定"/>
        </form>
        <%
    out.println("Session ID：" + session.getId());
    if(DatabaseModify.getSelectColumnValue1() != null){out.println(DatabaseModify.getSelectColumnValue1()+" "+DatabaseModify.getSelectColumnValue2());};
%> 
    </body>
</html>