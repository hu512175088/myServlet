$().ready(function () {
    $("#log_btn").click(function () {
        var userName = $("#userName").val();
        var password = $("#password").val();
        if (userName == null || userName ==""){
            $("#userNameSpan").text("用户名不能为空").css({"color":"red"})
            return false;
        }
        if (password == null || password ==""){
            $("#passwordSpan").text("用户名密码不能为空").css({"color":"red"})
            return false;
        }else{
            $.post(
                "loginServlet",
                "userName=" + userName + "&password=" + password,
                function callback(result) {
                    if (result =="successLogin"){
                        window.location.href="homeServlet";
                    }else if(result = "errorLogin"){
                        window.location.href="erroorServlet";
                    }
                }
            );
            return true
        }
    })
});