<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018-09-25
  Time: 11:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="js/jquery-1.8.3.js"></script>
<script src="js/jquery-1.8.3.min.js"></script>
<script type="text/javascript" src="js/Register.js"></script>
<html>
<head>
    <title>注册</title>
</head>
<body>
    <table>
        <tr>
            <td>
                用户名:<input type="text" placeholder="请输入用户名" id="userName"><span id="userNameSpan"></span>
            </td>
        </tr>
        <tr>
            <td>
                密码:<input type="password" placeholder="请输入密码" id="password"><span id="passwordSpan"></span>
            </td>
        </tr>
        <tr>
            <td>
                <input type="button" value="确定" id="register_btn">
            </td>
        </tr>
    </table>

</body>
</html>
