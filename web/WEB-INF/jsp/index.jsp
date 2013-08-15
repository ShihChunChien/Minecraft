<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <base target="content" />
        <title>歡迎來到九天之上</title>
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/2.0.3/jquery.min.js" type="text/javascript"></script>
        <script src="http://swip.codylindley.com/jquery.DOMWindow.js" type="text/javascript"></script>
        <script src="https://ido-yql-demo.googlecode.com/files/jquery.dimensions.js" type="text/javascript"></script>
        <script src="https://p2pdesi.googlecode.com/files/jquery.autoheight.js" type="text/javascript"></script>
    </head>
    <body>
        <div id="header">
            <!--<img src="resource/pic/logo.jpg" title="" alt="" class="fit-image"/><br>-->
            <div class="dropline">
                <ul>
                    <li><a href="http://up9cloud.net/notice.htm" class="current" target="content">公告</a></li>
                    <li><a href="instruction.htm" target="content">新手說明</a>
                    </li>
                    <li><a href="server.htm" target="content">伺服介紹</a> 
                        <ul> 
                            <li><a href="#" target="content">#</a></li>
                            <li><a href="#" target="content">#</a></li>
                            <li><a href="#" target="content">#</a></li>
                            <li><a href="#" target="content">#</a></li>
                        </ul>
                    </li>
                    <li><a href="donate.htm" target="content">贊助</a></li>
                    <li><a href="download.htm" target="content">下載</a></li>
                    <li><a href="cs.htm" target="content">客服</a></li>
                </ul>
            </div>
            <div class="header-left"></div>
            <div class="header-middle">
                <%--<a href="login.htm">登入</a>--%>
                <a href="register.htm" class="absoluteIframeDOMWindow" >
                    <img src="resource/pic/botton_main.png" id="botton_main" title="註冊" alt="註冊"/>
                </a>
                <script type="text/javascript">
                    $('.absoluteIframeDOMWindow').openDOMWindow({
                        height: 350,
                        width: 350,
                        //positionType: 'absolute',
                        //positionTop: 100,
                        //positionLeft: 550,
                        eventType: 'click',
                        windowSource: 'iframe',
                        windowPadding: 0,
                        loader: 1,
                        loaderImagePath: 'animationProcessing.gif',
                        loaderHeight: 16,
                        loaderWidth: 17
                    });
                </script>
            </div>
            <div class="header-right"></div>
        </div>
        <div id="wrapper">
            <div class="left-wrapper"></div>
            <div class="right-wrapper"></div>
            <div class="middle-wrapper">
                <div class="frame-top">
                    <div class="frame-upper-left"></div>
                    <div class="frame-upper-right"></div>
                    <div class="frame-upper-middle"></div>
                </div>
                <div class="frame-middle">
                    <div class="frame-left"></div>
                    <div class="frame-right"></div>
                    <div class="frame-content">
                        <iframe src="notice.htm" id="content" name="content"
                                class="autoHeight"
                                scrolling="no"
                                width="100%"
                                frameBorder="0">
                        </iframe>
                    </div>   
                </div>
                <div class="frame-bottom">
                    <div class="frame-lower-left"></div>
                    <div class="frame-lower-right"></div>
                    <div class="frame-lower-middle"></div>
                </div>
            </div>
        </div>
        <div id="footer">
            <div class="footer-left"></div>
            <div class="footer-middle">
                <a href="http://www.gamerating.org.tw/gsgi_way.php">
                    <img src="http://www.gamerating.org.tw/images/class_15.gif" id="PG_15" title="輔導十五歲級" alt="輔導十五歲級"/></a><br>
            </div>
            <div class="footer-right"></div>
        </div>
    </body>
</html>
<script src="resource/js/index.usage.js" type="text/javascript"></script>
<link href="resource/CSS/reset.css" rel="stylesheet" type="text/css">
<link href="resource/CSS/style.css" rel="stylesheet" type="text/css">