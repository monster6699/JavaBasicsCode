package monster.resp;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/respDemo03")
public class respDemo03 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext servletContext = request.getServletContext();
        // 获取mine的类型
        String mimeType = servletContext.getMimeType("哪吒.jpg");
        System.out.println(mimeType);

        ServletContext servletContext1 = this.getServletContext();
        // 同一个对象
        System.out.println(servletContext == servletContext1);

        /*
        2. 域对象：共享数据
            1. setAttribute(String name,Object value)
            2. getAttribute(String name)
            3. removeAttribute(String name)
         */
        servletContext.setAttribute("msg", "hello every one");
        response.sendRedirect("/respDemo04");
    }
}
