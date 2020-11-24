package monster.resp;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/respDemo04")
public class respDemo04 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext servletContext = request.getServletContext();

        /*
        2. 域对象：共享数据
            1. setAttribute(String name,Object value)
            2. getAttribute(String name)
            3. removeAttribute(String name)
         */
        Object msg = servletContext.getAttribute("msg");
        String msg1 = servletContext.getMimeType("msg");
        response.setContentType(msg1);
        //字符流
//        response.getWriter().write(msg + "");
        //字节流
        response.getOutputStream().write(String.valueOf(msg).getBytes());
    }
}
