package monster.service;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;

@WebServlet("/Demo07")
public class Demo07 extends HttpServlet {
    /*
    2. 通用功能：
		1. 获取请求参数通用方式：不论get还是post请求方式都可以使用下列方法来获取请求参数
			1. String getParameter(String name):根据参数名称获取参数值    username=zs&password=123
			2. String[] getParameterValues(String name):根据参数名称获取参数值的数组  hobby=xx&hobby=game
			3. Enumeration<String> getParameterNames():获取所有请求的参数名称
			4. Map<String,String[]> getParameterMap():获取所有参数的map集合
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        // 1. String getParameter(String name):根据参数名称获取参数值
        String username = request.getParameter("username");
        System.out.println(username);
        System.out.println("------------------------------------");
        // 2. String[] getParameterValues(String name):根据参数名称获取参数值的数组
        String[] ages = request.getParameterValues("age");
        String s = Arrays.toString(ages);
        System.out.println(s);
        System.out.println("------------------------------------");
        // 3. Enumeration<String> getParameterNames():获取所有请求的参数名称
        Enumeration<String> parameterNames = request.getParameterNames();
        while (parameterNames.hasMoreElements()) {
            System.out.println(parameterNames.nextElement());
        }
        System.out.println("------------------------------------");
        // 4. Map<String,String[]> getParameterMap():获取所有参数的map集合
        Map<String, String[]> parameterMap = request.getParameterMap();
        Set<Map.Entry<String, String[]>> entries = parameterMap.entrySet();
        for (Map.Entry<String, String[]> data:entries) {
            String key = data.getKey();
            String[] value = data.getValue();
            System.out.println(key + ":" + Arrays.toString(value) );
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
