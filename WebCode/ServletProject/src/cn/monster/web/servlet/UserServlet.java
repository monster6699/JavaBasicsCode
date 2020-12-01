package cn.monster.web.servlet;

import cn.monster.domain.User;
import cn.monster.service.UserService;
import cn.monster.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/userServlet")
public class UserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserService userService = new UserServiceImpl();
        List<User> users = userService.findAll();
        if(users != null) {
            request.setAttribute("users", users);
            request.getRequestDispatcher("/list.jsp").forward(request, response);
        } else {
            request.setAttribute("msg", "查询失败");
            request.getRequestDispatcher("/index.jsp").forward(request, response);;
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
