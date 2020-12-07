package cn.monster.web.servlet;

import cn.monster.service.UserService;
import cn.monster.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

@WebServlet("/userDelSelectServlet")
public class UserDelSelectServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String[] uids = request.getParameterValues("uid");
        UserService userService = new UserServiceImpl();
        Boolean aBoolean = userService.delSelect(uids);
        if(aBoolean) {
            response.sendRedirect(request.getContextPath() + "/userServlet");
        } else {
            response.setContentType("text/html;charset=utf-8");
            response.getWriter().write("删除失败");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
