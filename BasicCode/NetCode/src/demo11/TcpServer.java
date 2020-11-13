package demo11;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(1314);
        Socket accept = serverSocket.accept();
        while (true) {
            Thread thread = new Thread(new ServeRuable(accept));
            thread.start();
        }

    }

}
