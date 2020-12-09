package cn.monster.servelet;

import cn.monster.dao.impl.ProvinceDaoImpl;
import cn.monster.domain.Province;
import cn.monster.service.ProvinceService;
import cn.monster.service.impl.ProvinceServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/provinceServlet")
public class ProvinceServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ProvinceService provinceService = new ProvinceServiceImpl();
        String provinces = provinceService.findProvinceAll();
//        ObjectMapper objectMapper = new ObjectMapper();
//        String s = objectMapper.writeValueAsString(provinces);
        response.setContentType("application/json;charset=utf-8");
        response.getWriter().write(provinces);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
