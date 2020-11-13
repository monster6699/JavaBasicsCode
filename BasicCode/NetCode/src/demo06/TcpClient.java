package demo06;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TcpClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 1314);

        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("我来了， 我是客户端".getBytes());


        InputStream inputStream = socket.getInputStream();
        byte[] bt = new byte[1024];

        int read = inputStream.read(bt);
        String s = new String(bt, 0, read);
        System.out.println(s);

    }
}
