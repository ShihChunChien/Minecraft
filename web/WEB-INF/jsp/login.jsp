<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">          
        <title>Welcome to Spring Web MVC project</title>
    </head>       

<body>    
請輸入使用者名稱與密碼：<p> 
    <form name="loginform" action="login.do" method="post"> 
        帳號 <input type="text" name="username" value="sshiuan2@gmail.com"/><br> 
        密碼 <input type="password" name="password" value="Aa12341234"/><br> 
        <input type="submit" value="確定"/> 
    </form> 
    輸入錯誤將會再回到此頁面
</body>
</html>