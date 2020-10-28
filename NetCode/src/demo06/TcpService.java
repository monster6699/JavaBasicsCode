package demo06;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpService {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(1314);
        Socket accept = serverSocket.accept();
        InputStream inputStream = accept.getInputStream();
        byte[] bytes = new byte[1024];
        int len = inputStream.read(bytes);
        String s = new String(bytes, 0, len);
        System.out.println(s);

        OutputStream outputStream = accept.getOutputStream();
        outputStream.write("我来了我是服务器".getBytes());

        serverSocket.close();

    }
}
