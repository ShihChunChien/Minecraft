<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="/Minecraft/resource/CSS/fonts-min.css" rel="stylesheet" type="text/css" />
	<link href="/Minecraft/resource/CSS/tabview.css" rel="stylesheet" type="text/css" />
	<script src="/Minecraft/resource/js/yahoo-dom-event.js" type="text/javascript"></script>
	<script src="/Minecraft/resource/js/element-beta-min.js" type="text/javascript"></script>
	<script src="/Minecraft/resource/js/tabview.js" type="text/javascript"></script>
        <title>Welcome to Spring Web MVC project</title>
    </head>       

<body>
<div id="yuitabview1" class="yui-navset">
  <ul class="yui-nav">
    <li class="selected"><a href="#tab1"><em>我有正版帳號</em></a></li>
    <li><a href="#tab2"><em>我沒有正版帳號</em></a></li>        
  </ul>
  <div class="yui-content">
   <div id="tab1" align="left">
    請輸信箱與密碼：<p> 
    <form name="registerform" action="register.do" method="post" onsubmit="return check();">
    	<input type="hidden"  name="status" value="1">
        信箱 <input type="text" name="email"/><br>        
        密碼 <input type="password" name="password"/><br>        
        性別
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <input type="radio" name="sex" value="1">男
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
       	<input type="radio" name="sex" value="2">女<br>
    <input type="submit" value="註冊"/>
    </form>
    </div>
    <div id="tab2" align="left">
    請輸帳號與密碼：<p> 
    <form name="registerform" action="register.do" method="post" onsubmit="return check();">
	    <input type="hidden"  name="status" value="0">
        帳號 <input type="text" name="username"/><br>        
        密碼 <input type="password" name="password"/><br>       
        性別
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
        <input type="radio" name="sex" value="1">男
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <input type="radio" name="sex" value="2">女<br>
    <input type="submit" value="註冊"/>
    </form>
   <!-- </div>    
  </div>
</div>  -->
<script language="javascript" type="text/javascript">
function check()
{
  if(document.registerform.email.value ===""){alert("請輸入信箱");return false;}
  if(document.registerform.username.value ===""){alert("請輸入帳號");return false;}    
  if(document.registerform.password.value ===""){alert("請輸入密碼");return false;}
  if(document.registerform.nickname.value ===""){alert("請輸入暱稱");return false;}
  if(document.registerform.sex.value ===""){alert("請輸入性別");return false;} 
}

(function() { 
        var cn = document.body.className.toString();
        if (cn.indexOf('yui-skin-sam') === -1) {
          document.body.className += " yui-skin-sam";
        }
      })();
      
      var yuitabview1 = new YAHOO.widget.TabView('yuitabview1');

</script>
</body>
</html>