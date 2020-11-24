package monster.resp;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/respDemo05")
public class respDemo05 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext servletContext = this.getServletContext();
        String realPath = servletContext.getRealPath("/b.txt");
        String realPath1 = servletContext.getRealPath("/WEB-INF/c.txt");
        String realPath2 = servletContext.getRealPath("/WEB-INF/classes/a.txt");
        response.getOutputStream().write((realPath+"\r\n").getBytes());
        response.getOutputStream().write((realPath1+"\r\n").getBytes());
        response.getOutputStream().write((realPath2+"\r\n").getBytes());
    }
}