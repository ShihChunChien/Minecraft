<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html> 
    <head>
        <jsp:include page="public/template/head_content.html"></jsp:include>
    </head> 
    <body>        
        ${user}<br>
        <span id="countbox"></span>秒後自動返回首頁
        <script type="text/JavaScript">
            var sec = 5;
            for(var i=sec;i>=0;i--) 
            { 
                window.setTimeout("counter(" + i + ")", (sec-i) * 1000); 
            } 
            function counter(num)
            { 
            document.getElementById("countbox").innerHTML = num ; 
            if (num == 0){window.location=window.top.location = "index.html";}
            }
        </script>
    </body>
</html>