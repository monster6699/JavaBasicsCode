package cn.monster.web.servlet;

import cn.monster.domain.PageBean;
import cn.monster.domain.User;
import cn.monster.service.UserService;
import cn.monster.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@WebServlet("/userSelectByPageServlet")
public class UserSelectByPageServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String currentPage = request.getParameter("currentPage");
        String rows = request.getParameter("rows");
        Map<String, String[]> parameterMap = request.getParameterMap();
        if(currentPage == null || "".equals(currentPage)) {
            currentPage = "1";
        }
        if(rows == null || "".equals(rows)) {
            rows = "5";
        }
        UserService userService = new UserServiceImpl();
        PageBean<User> userSelectPage = userService.findUserSelectPage(currentPage, rows, parameterMap);
        System.out.println(userSelectPage);
        request.setAttribute("pb", userSelectPage);
        request.setAttribute("condition", parameterMap);
        request.getRequestDispatcher("/list.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
