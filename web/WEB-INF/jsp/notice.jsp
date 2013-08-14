<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>歡迎來到九天之上</title>
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/2.0.3/jquery.min.js" type="text/javascript"></script>
        <script src="https://ido-yql-demo.googlecode.com/files/jquery.dimensions.js" type="text/javascript"></script>
        <script type="text/javascript">
            $(document).ready(function() {
                var $winwidth = $(window).width();
                $("img.fit-image").attr({
                    width: $winwidth
                });
                $(window).bind("resize", function() {
                    var $winwidth = $(window).width();
                    $("img.fit-image").attr({
                        width: $winwidth
                    });
                });
            });
        </script>   
    </head>

    <body>
        <div id="tableTop">
            <img src="resource/pic/notice/Announcement-Top.png" title="" alt="" class="fit-image"/><br>
        </div>
        <div id="table">
            <h1>
                三步驟</h1>
        </div>
        <img src="resource/pic/play_step_all.jpg" title="馬上玩三步驟" alt="注冊&rarr;開遊戲(輸入IP)&rarr;登入"/><br>
        <br>
        <div id="table">
            <div class="tr">
                <div class="td">遊戲IP</div>
                <div class="td">192.200.109.235</div>
                <div class="td"><span style="color:#a9a9a9;">192.200.109.235:25566</span></div>
            </div>
        </div>
    </body>
</html>
