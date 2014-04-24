<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <title>up9cloud.net - 九天之上 | Minecraft 麥塊 - 繁體中文私服</title>
        <base target="_self" />        
    </head>
    <body>    
    <font>
    <% if(session.getAttribute("UserName") != null)
    {out.println(session.getAttribute("UserName"));out.println(session.getAttribute("UserSession"));out.println(session.getAttribute("UserEmail"));out.println(session.getAttribute("pwdSession"));}%>
    </font>
    <br>
    ${user}
    <font color="white"><a href="usermodify.htm" target="content">編輯會員資料</a></font>
    </body>
</html>