package demo05;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpService {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(1314);

        Socket accept = serverSocket.accept();
        InputStream inputStream = accept.getInputStream();
        byte[] bt = new byte[1024];
        int len;

        while ((len=inputStream.read(bt)) != -1) {
            System.out.print(new String(bt, 0, len));
        }
    }
}
