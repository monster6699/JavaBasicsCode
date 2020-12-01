package cn.monster.web.servlet.login;


import cn.monster.domain.UserLogin;
import cn.monster.service.UserService;
import cn.monster.service.impl.UserServiceImpl;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import static javax.swing.text.html.CSS.getAttribute;

@WebServlet("/userLoginServlet")
public class UserLoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String vcode = request.getParameter("verifycode");
        Map<String, String[]> parameterMap = request.getParameterMap();
        HttpSession session = request.getSession();
        String checkcode_server = (String)session.getAttribute("CHECKCODE_SERVER");

        if (checkcode_server== null || !checkcode_server.equalsIgnoreCase(vcode)) {
            request.setAttribute("msg", "验证码错误");
            request.getRequestDispatcher("/login.jsp").forward(request, response);
            return;
        }
        session.removeAttribute("CHECKCODE_SERVER");
        UserLogin userLogin = new UserLogin();
        try {
            BeanUtils.populate(userLogin, parameterMap);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        UserService userService = new UserServiceImpl();
        UserLogin user = userService.findUserLogin(userLogin);
        if(user != null) {
            session.setAttribute("user", userLogin);
            request.getRequestDispatcher("/userServlet").forward(request, response);
        } else {
            request.setAttribute("msg", "用户或者密码错误");
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        }





    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
