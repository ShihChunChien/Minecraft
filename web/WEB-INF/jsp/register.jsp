<%@page import="controller.RegisterForm"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>up9cloud.net - 九天之上 | Minecraft 麥塊 - 繁體中文私服</title>
        <link href="/resource/CSS/register.style.css" rel="stylesheet" type="text/css">
        <link href="http://yui.yahooapis.com/2.9.0/build/fonts/fonts-min.css" rel="stylesheet" type="text/css" />
        <link href="http://yui.yahooapis.com/2.9.0/build/tabview/assets/skins/sam/tabview.css" rel="stylesheet" type="text/css" />
        <script src="http://yui.yahooapis.com/2.9.0/build/yahoo-dom-event/yahoo-dom-event.js" type="text/javascript"></script>
        <script src="http://yui.yahooapis.com/2.9.0/build/element/element-min.js" type="text/javascript"></script>
        <script src="http://yui.yahooapis.com/2.9.0/build/tabview/tabview-min.js" type="text/javascript"></script>
    </head>
    <body>
        <div id="yuitabview1" class="yui-navset" >
            <ul class="yui-nav">
                <li name="selector2" class="selected" ><a href="#tab2"><em>普通註冊</em></a></li>
                <li name="selector1"><a href="#tab1"><em>正版帳號註冊</em></a></li>
            </ul>
            <div class="yui-content">
                <div id="tab2" align="left">
                    <h3>請填寫資料：</h3>
                    <form id="registerform" name="registerform" action="register.do" method="post" onsubmit="return checktab2();">
                        <input type="hidden"  name="status" value="0"/>
                        帳號 <select name="usernamePrefix">
                            <option value="sp_" >sp_</option>
                            <%--<option value="up9cloud_" >up9cloud_</option>
                            <option value="" >_</option>--%>
                        </select>
                        <input type="text" name="username" value="請輸入帳號" onfocus="if (this.value == this.defaultValue)
                                this.value = ''"/>
                        <input type="hidden" name="email" value="請輸入mail" onfocus="if (this.value == this.defaultValue)
                                this.value = ''"/><br>
                        密碼 <input type="password" name="password" value=""/><br>
                        性別 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <input type="radio" name="sex" value="1">男
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <input type="radio" name="sex" value="2">女<br><br>
                        <input type="submit" value="註冊"/>
                        <div class="tip" name="tips0">${tips0}</div>
                    </form>
                </div>
                <div id="tab1" align="left">
                    <h3>新手玩家請使用<span style="color:#b22222;">普通註冊</span></h3>
                    <div class="opacity">
                        注意！<br>
                        您必須有購買minecraft官方正版遊戲<br>
                        才可正版註冊<br>
                        如需代購請洽客服！<br>
                        <br>
                    </div>
                    <form id="registerform" name="registerform" action="register.do" method="post" onsubmit="return checktab1();">
                        <input type="hidden"  name="status" value="1"/>
                        <input type="hidden"  name="usernamePrefix" value=""/>
                        <input type="hidden" name="username" value=""/>
                        信箱 <input type="text" title="email" value="請輸入mail" name="email"
                                  onfocus="if (this.value == this.defaultValue)
                                this.value = ''"/><br>
                        密碼 <input type="password" value="" name="password"/><br>
                        性別 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <input id="sex" type="radio" name="sex" value="1">男
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <input type="radio" name="sex" value="2">女<br><br>
                        <input type="submit" value="註冊"/>
                        <div class="tip" name="tips1">${tips1}</div>
                    </form>
                </div>
            </div>
            <div align="right"><input type="button" value="回首頁" onClick="window.top.location.href = 'index.html';"></div>
        </div>
        <script src="/resource/js/register.usage.js" type="text/javascript"></script>
    </body>
</html>