<%--
  Created by IntelliJ IDEA.
  User: 10214
  Date: 2021/1/8
  Time: 22:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="jquery/jquery-2.1.1.min.js"></script>
    <script type="text/javascript">
        $(function() {
            $("#btn").click(function(){
                var array = [1,2,3];

                var requestBody = JSON.stringify(array);

                $.ajax({
                    "url":"send/array.html",
                    "type":"post",
                    "data":requestBody,
                    "contentType":"application/json;charset=UTF-8",
                    "dataType":"text",
                    "success": function(response) {
                        alert(response);
                    },
                    "error":function(response) {
                        alert(response);
                    }
                })
            })

            $("#btn1").click(function(){
                var array = [1,2,3];

                var requestBody = JSON.stringify(array);

                $.ajax({
                    "url":"send/object.json",
                    "type":"post",
                    "data":requestBody,
                    "contentType":"application/json;charset=UTF-8",
                    "dataType":"text",
                    "success": function(response) {
                        console.log(response);
                    },
                    "error":function(response) {
                        console.log(response);
                    }
                })
            })
        });
    </script>
</head>
<base href="http://${pageContext.request.serverName }:${pageContext.request.serverPort }${pageContext.request.contextPath }/"/>
<body>
<a href="test/ssm.html">测试SSM整合环境</a>
<br>
<br>
<button id="btn">ajax</button>
<br>
<br>
<button id="btn1">object</button>
</body>
</html>
