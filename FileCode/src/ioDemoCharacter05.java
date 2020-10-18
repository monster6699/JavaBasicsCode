import java.io.*;

public class ioDemoCharacter05 {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("FileCode/ioDemoCharacter04.java"));
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream("FileCode/copy.java"));

        // 方式1
        int ch;
        while ((ch=inputStreamReader.read()) !=-1) {
            outputStreamWriter.write(ch);
        }

        // 方式2
        char[] chars = new char[1024];
        int len;
        while ((len=inputStreamReader.read(chars)) != -1) {
            outputStreamWriter.write(chars, 0, len);
        }

        inputStreamReader.close();
        outputStreamWriter.close();





    }
}
