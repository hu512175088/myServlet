$(document).ready(function () {
    $("#register_btn").click(function () {
        var userName = $("#userName").val();
        var password = $("#password").val();
        if(userName =="" || userName==null){
            $("#userNameSpan").text("用户名不能为空").css({"color":"red"});
            return false;
        }else if (password =="" || password==null) {
            $("#passwordSpan").text("用户密码不能为空").css({"color":"red"});
            return false;
        }else{
            $.post(
                "userRegisterServlet",
                "userName=" + userName + "&password=" + password,
                function callback(result) {
                    if (result = "RegisterSuccess") {
                        window.location.href="homeServlet";
                    }else if(result = "Registererror"){
                        window.location.href="erroorServlet";
                    }
                }
            );
            return false;
        }
    });
});