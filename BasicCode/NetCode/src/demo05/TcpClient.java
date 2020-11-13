package demo05;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class TcpClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 1314);

        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello tcp 赶快收了我吧".getBytes());

        socket.close();

    }
}
