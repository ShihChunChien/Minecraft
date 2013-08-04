<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<%
  String stroacname=null;
  String strusername=null;
  String strpassword=null;  
  stroacname = request.getParameter("oacstr[2]");
  strusername = request.getParameter("username");  
  strpassword = request.getParameter("password");
%>
<html> 
<head><title>Login Success</title></head> 
<body>
<jsp:useBean id="resbean" class="controller.RegisterForm" scope="request"/>
<jsp:setProperty name="resbean" property="email" value="<%= stroacname %>" />
<jsp:setProperty name="resbean" property="username" value="<%= strusername %>" />
<jsp:setProperty name="resbean" property="password" value="<%= strpassword %>" />
<h1>恭喜您註冊成功！註冊資料如下：</h1><br>
<%if(stroacname != ""){%>
信箱: <jsp:getProperty name="resbean" property="email" /><br><%}else{%>
使用者名稱: <jsp:getProperty name="resbean" property="username" /><br><%}%>
密碼: <jsp:getProperty name="resbean" property="password" />
 <div align="right"><input type="button" value="回首頁" onClick="window.top.location.href='index.htm';"></div>
</body> 
</html>