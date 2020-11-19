package monster.service;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/Demo05")
public class Demo05 extends HttpServlet {
    /*
    获取请求头数据
    * 方法：
        * (*)String getHeader(String name):通过请求头的名称获取请求头的值
        * Enumeration<String> getHeaderNames():获取所有的请求头名称
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String s = headerNames.nextElement();
            String header = request.getHeader(s);
            System.out.println(s + "," + header);
        }


    }
}
