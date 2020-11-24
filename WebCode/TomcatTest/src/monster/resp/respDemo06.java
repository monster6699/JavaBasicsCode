package monster.resp;

import util.DownLoadUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;

@WebServlet("/respDemo06")
public class respDemo06 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String fileName = request.getParameter("fileName");
        String header = request.getHeader("user-agent");
        ServletContext servletContext = this.getServletContext();
        String realPath = servletContext.getRealPath("/WEB-INF/" + fileName);
        System.out.println(realPath);
        FileInputStream fileInputStream = new FileInputStream(realPath);

        String mimeType = servletContext.getMimeType(fileName);
        response.setContentType(mimeType);
        fileName = DownLoadUtils.getFileName(header, fileName);
        response.setHeader("content-disposition","attachment;filename=" + fileName);
        ServletOutputStream outputStream = response.getOutputStream();
        byte[] bt = new byte[1024 * 5];
        int len;
        while ((len = fileInputStream.read(bt)) != -1) {
            outputStream.write(bt, 0, len);
        }
        fileInputStream.close();

    }
}
