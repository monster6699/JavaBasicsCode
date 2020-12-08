package cn.monster.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter("/*")
public class LoginFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest) req;
        String requestURI = request.getRequestURI();
        if(requestURI.contains("/userLoginServlet") || requestURI.contains("/login.js") || requestURI.contains("/css/") || requestURI.contains("/fonts/") || requestURI.contains("/checkCode")) {
            chain.doFilter(req, resp);
        } else {
            HttpSession session = request.getSession();
            Object user = session.getAttribute("user");
            if(user != null ){
                chain.doFilter(req, resp);
            } else {
                request.setAttribute("msg", "请先登录！！");
                request.getRequestDispatcher("/login.jsp").forward(request, resp);
            }
        }

    }

    public void init(FilterConfig config) throws ServletException {

    }

}
