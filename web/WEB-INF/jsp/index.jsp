<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <base target="maincontent" />
        <title>歡迎來到九天之上</title>
        <link href="resource/CSS/reset.css" rel="stylesheet" type="text/css">
        <link href="resource/CSS/style.css" rel="stylesheet" type="text/css">
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/2.0.3/jquery.min.js" type="text/javascript"></script>
        <script src="http://swip.codylindley.com/jquery.DOMWindow.js" type="text/javascript"></script>
        <script src="https://ido-yql-demo.googlecode.com/files/jquery.dimensions.js" type="text/javascript"></script>
        <script src="https://p2pdesi.googlecode.com/files/jquery.autoheight.js" type="text/javascript"></script>
        <script src="resource/js/index.usage.js" type="text/javascript"></script>
    </head>
    <body>
        <div id="header">
            <img src="resource/pic/logo.jpg" title="" alt="" class="fit-image"/><br>
            <ul id="dropline">
                <li class="current"><a href="notice.htm" target="content"><b>公告</b></a>
                    <ul>
                        <li></li>
                    </ul>
                </li>
                <li><a href="instruction.htm" target="content"><b>新手說明</b></a>
                    <ul>
                        <li></li>
                    </ul>
                </li>
                <%--<li><a href="server.htm" target="content"><b>伺服介紹</b></a>
                    <ul>
                        <li></li>
                        <!--<li><a class="last" href="#url">Dropdown Five</a></li>-->
                    </ul>
                </li>
                <li><a href="donate.htm" target="content"><b>贊助</b></a>
                    <ul>
                        <li></li>
                        <!--<li><a href="#url">Dropline One</a></li>
                        <li class="current_sub"><a href="#url">Dropline Two</a></li>
                        <li><a href="#url">Dropline Three</a></li>
                        <li><a class="last" href="#url">Dropline Four</a></li>-->
                    </ul>
                </li>--%>
                <li><a href="download.htm" target="content"><b>下載</b></a>
                    <ul>
                        <%--<li></li>
                        <li><a href="#url">Flyout One</a></li>
                        <li><a href="#url">Flyout Two</a></li>
                        <li><a href="#url">Flyout Three</a></li>
                        <li><a href="#url">Flyout Four</a></li>
                        <li><a class="last" href="#url">Flyout Five</a></li>--%>
                    </ul>
                </li>
                <li><a href="cs.htm" target="content"><b>客服</b></a>
                    <ul>
                        <li></li>
                    </ul>
                </li>
            </ul>
        </div>
        <div id="wrapper">
            <div class="left-wrapper">
                <%--<a href="login.htm">登入</a>--%>
                <a href="register.htm" class="absoluteIframeDOMWindow" >註冊</a>
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
                    <div id="content" class="frame-content">
                        <iframe src="notice.htm" id="content"
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
    </body>
</html>