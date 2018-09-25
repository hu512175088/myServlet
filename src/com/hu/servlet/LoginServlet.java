package com.hu.servlet;

import com.hu.po.User;
import com.hu.service.UserService;
import com.hu.service.UserServiceImpl;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/loginServlet")
public class LoginServlet extends HttpServlet {
    private UserService service =new UserServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        User user = new User();
        user.setUserName(userName);
        User _user = service.getUser(user);
        if (_user.getUserName() != null) {
            if (_user.getPassword().equals(password)) {
                writer.print("successLogin");
            }
        } else {
            writer.print("errorLogin");
        }
        writer.flush();
        writer.close();
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
