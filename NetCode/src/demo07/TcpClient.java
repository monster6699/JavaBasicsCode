package demo07;

import java.io.*;
import java.net.Socket;

public class TcpClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 1314);
        OutputStream outputStream = socket.getOutputStream();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s=bufferedReader.readLine()) != null) {
            if("886".equals(s)) {
                break;
            }

            bufferedWriter.write(s);
            bufferedWriter.newLine();
            bufferedWriter.flush();

        }

        socket.close();

    }
}
