
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
</head>
<body>
姓名：<input type="text" id="name"><br>
接收消息：<textarea id="get" style="height:300px;"></textarea><br>
发送消息：<textarea id="send" style="height:100px;"></textarea><br>
<button id="bt">发送</button>


<script type="text/javascript">

    var ws=new WebSocket("ws://10.192.56.144:8080/socket");
    $("#bt").click(function(){
        ws.send($("#name").val()+":  "+$("#send").val()+"\n");
    });

    ws.onopen = function () {
        console.log("onpen");
        ws.send($("#send").val()+"你们好\n");
    }

    ws.onclose = function () {
        console.log("onclose");
    }

    ws.onmessage = function (msg) {
        console.log(msg);
        $("#get").val($("#get").val()+msg.data);
    }



</script>
</body>
</html>
