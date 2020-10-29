package demo10;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(1314);
        Socket accept = serverSocket.accept();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(accept.getInputStream()));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("NetCode/b.iml"));

        String line;
        while ((line=bufferedReader.readLine()) != null) {
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }

        BufferedWriter bufferedWriter1 = new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));
        bufferedWriter1.write("服务器接收文件成功");
        bufferedWriter1.newLine();
        bufferedWriter1.flush();

        bufferedWriter.close();
        serverSocket.close();




    }
}
