package cn.monster.web.servlet;

import cn.monster.service.UserService;
import cn.monster.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/userDeleteServlet")
public class UserDeleteServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        UserService userService = new UserServiceImpl();
        Boolean delete = userService.delete(id);
        if(delete) {
            response.sendRedirect(request.getContextPath() + "/userServlet");
        } else {
            response.getWriter().write("删除失败");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
