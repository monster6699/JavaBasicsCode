package monster.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/cookie/demo01")
public class demo01 extends HttpServlet {
    /*
    1. 访问一个Servlet，如果是第一次访问，则提示：您好，欢迎您首次访问。
    2. 如果不是第一次访问，则提示：欢迎回来，您上次访问时间为:显示时间字符串
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cookies = request.getCookies();
        boolean flag = true;
        if(cookies != null) {
            for (Cookie cookie : cookies) {
                String name = cookie.getName();
                if ("lastTime".equals(name)) {
                    flag = false;
                    String value = cookie.getValue();
                    value = URLDecoder.decode(value, "utf-8");
                    Date date = new Date();
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
                    String lastTime = simpleDateFormat.format(date);
                    lastTime = URLEncoder.encode(lastTime, "utf-8");
                    cookie.setValue(lastTime);
                    response.addCookie(cookie);
                    response.setContentType("text/html;charset=utf-8");
                    response.getWriter().write("你上次登录的时间为" + value);
                    break;
                }
            }
        }
        if(flag) {
            Date date = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
            String lastTime = simpleDateFormat.format(date);
            lastTime = URLEncoder.encode(lastTime, "utf-8");
            Cookie cookie = new Cookie("lastTime", lastTime);
            response.addCookie(cookie);
            response.setContentType("text/html;charset=utf-8");
            response.getWriter().write("欢迎你第一次登录本网站");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
