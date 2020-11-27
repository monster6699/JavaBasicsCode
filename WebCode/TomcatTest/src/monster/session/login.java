package monster.session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;

@WebServlet("/login")
public class login extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        String code = request.getParameter("code");
        HttpSession session = request.getSession();
        Object checkCode_session = session.getAttribute("checkCode_session");
        if(code.equals(checkCode_session)) {
            if("monster".equals(userName) && "zaq1xsw2".equals(password)) {
                session.removeAttribute("checkCode_session");
                request.setAttribute("userName", userName);
                request.getRequestDispatcher("/success.jsp").forward(request, response);
            } else {
                request.setAttribute("error", "用户名或者密码错误");
                request.getRequestDispatcher("/index.jsp").forward(request, response);
            }
        } else {
            request.setAttribute("error", "验证码错误");
            request.getRequestDispatcher("/index.jsp").forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
