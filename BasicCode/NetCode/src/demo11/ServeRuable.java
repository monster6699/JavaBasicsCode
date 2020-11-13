package demo11;

import java.io.*;
import java.net.Socket;

public class ServeRuable implements Runnable {
    private Socket accept;

    public ServeRuable(Socket accept) {
        this.accept = accept;
    }

    @Override
    public void run() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(accept.getInputStream()));
            int count = 0;
            File file = new File("NetCode/b" + count + ".iml");

            while (file.exists()) {
                count++;
                file = new File("NetCode/b" + count + ".iml");
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }

            BufferedWriter bufferedWriter1 = new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));
            bufferedWriter1.write("服务器接收文件成功");
            bufferedWriter1.newLine();
            bufferedWriter1.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
