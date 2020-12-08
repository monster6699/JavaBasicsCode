package cn.monster.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@WebFilter("/*")
public class KeywordFilter implements Filter {
    private List<String> keyWordList = new ArrayList<String>();

    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        ServletRequest request = (ServletRequest) Proxy.newProxyInstance(req.getClass().getClassLoader(), req.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if ("getParameter".equals(method.getName())) {
                    String value = (String) method.invoke(req, args);
                    if (value != null) {
                        for (String list : keyWordList) {
                            if (value.contains(list)) {
                                value = value.replaceAll(list, "****");
                            }
                        }
                        return value;
                    }
                }

                return method.invoke(req, args);
            }
        });
        chain.doFilter(request, resp);
    }

    public void init(FilterConfig config) throws ServletException {
        try {
            ServletContext servletContext = config.getServletContext();
            String realPath = servletContext.getRealPath("/keyWord.txt");
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(realPath), "utf-8");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                keyWordList.add(line);
            }
            System.out.println(keyWordList);
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
