<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <base target="maincontent" />
        <title>Welcome to Spring Web MVC project</title>   
        <link href="/Minecraft/resource/CSS/reset.css" rel="stylesheet" type="text/css">
        <link href="/Minecraft/resource/CSS/style.css" rel="stylesheet" type="text/css">       
        <script src="/Minecraft/resource/js/jquery-1.3.2.min.js" type="text/javascript"></script>
        <script src="/Minecraft/resource/js/jquery.DOMWindow.js" type="text/javascript"></script>
    </head>
    <body>    
        <div id="header">
            <img id="logo" src="/Minecraft/resource/pic/logo.jpg" width="190" height="127" />

            <ul id="dropline">
                <li class="current"><a href="notice.htm"><b>公告</b></a>	
                    <ul>
                        <li></li>
                    </ul>	
                </li>
                <li><a href="instruction.htm"><b>新手說明</b></a>	
                    <ul>
                        <li></li>
                    </ul>	
                </li>
                <li><a href="server.htm"><b>伺服介紹</b></a>	
                    <ul>
                        <li></li>                        
                        <!--<li><a class="last" href="#url">Dropdown Five</a></li>-->
                    </ul>	
                </li>
                <li><a href="donate.htm"><b>贊助</b></a>	
                    <ul>
                        <li></li>
                        <!--<li><a href="#url">Dropline One</a></li>
                        <li class="current_sub"><a href="#url">Dropline Two</a></li>
                        <li><a href="#url">Dropline Three</a></li>
                        <li><a class="last" href="#url">Dropline Four</a></li>-->
                    </ul>	
                </li>
                <li><a href="download.htm"><b>下載</b></a>	
                    <ul>
                        <li></li>
                        <!--<li><a href="#url">Flyout One</a></li>
                        <li><a href="#url">Flyout Two</a></li>
                        <li><a href="#url">Flyout Three</a></li>
                        <li><a href="#url">Flyout Four</a></li>
                        <li><a class="last" href="#url">Flyout Five</a></li>-->
                    </ul>	
                </li>
                <li><a href="cs.htm"><b>客服</b></a>	
                    <ul>
                        <li></li>
                    </ul>	
                </li>	
            </ul> 
        </div>

        <div id="wrapper">
            <div id="side">
                <!--<a href="login.htm">登入</a><br><br><br>
                <a href="register.htm">註冊</a><br>-->
                	<a href="register.htm" class="absoluteIframeDOMWindow">註冊</a> 
					<script type="text/javascript"> 
					$('.absoluteIframeDOMWindow').openDOMWindow({ 
					height:350, 
					width:350, 
					positionType:'absolute', 
					positionTop:230, 
					eventType:'click', 
					positionLeft:550, 
					windowSource:'iframe', 
					windowPadding:0, 
					loader:1, 
					loaderImagePath:'animationProcessing.gif', 
					loaderHeight:16, 
					loaderWidth:17 
					}); 
					</script>              
            </div>
            <div id="content">    
                <iframe class="iframe" id="maincontent" scrolling="auto" >
                    <img src="/Minecraft/resource/pic/index.gif">
                </iframe>
       </div>
       </div>     
</body>
</html>