package com.hu.servlet;

import com.hu.po.User;
import com.hu.service.UserService;
import com.hu.service.UserServiceImpl;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/userRegisterServlet")
public class UserRegisterServlet extends javax.servlet.http.HttpServlet {
    private UserService service = new UserServiceImpl();

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        PrintWriter writer =response.getWriter();
        //接收前台数据
        String userName = request.getParameter("userName");
        String password =request.getParameter("password");
        User user = new User(userName,password);
        int result =service.addUser(user);
        if (result > 0){
            writer.print("RegisterSuccess");
        }else {
            writer.print("Registererror");
        }
        writer.close();
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        this.doPost(request,response);
    }
}
