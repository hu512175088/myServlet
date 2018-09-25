<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018-09-25
  Time: 14:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="js/jquery-1.8.3.js"></script>
<script src="js/jquery-1.8.3.min.js"></script>
<script type="text/javascript" src="js/login.js"></script>
<html>
<head>
    <title>登录</title>
</head>
<body>
    <table>
        <tr>
                用户名:<input type="text" id="userName" placeholder="请输入用户名"><span id="userNameSpan"></span>
        </tr>
        <tr>
            <td>
                密码:<input type="password" id="password" placeholder="请输入用户密码"><span id="passwordSpan"></span>
            </td>
        </tr>
        <tr>
            <td>
                <input type="button" id="log_btn" value="登录">
            </td>
            <td><input type="button" value="注册" onclick="javascript:window.location.href='register.jsp'"></td>
        </tr>
    </table>
</body>
</html>
