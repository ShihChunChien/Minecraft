<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <title>up9cloud.net - 九天之上 | Minecraft 麥塊 - 繁體中文私服</title>
        <base target="_self" />        
    </head>
    <body>
    <font color="white">Hi!</font>
    <font color="white"><% if(session.getAttribute("UserName") != null){out.println(session.getAttribute("UserName"));} %></font>
    </body>
</html>