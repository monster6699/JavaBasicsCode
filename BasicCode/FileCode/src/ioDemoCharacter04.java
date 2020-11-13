import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ioDemoCharacter04 {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("FileCode/d.txt"));
        // 方式1
        int ch;
        while ((ch=inputStreamReader.read()) != -1) {
            System.out.print((char)ch);
        }

        // 方式2
        char[] chars = new char[1024];
        int len;
        while ((len = inputStreamReader.read(chars)) != -1) {
            System.out.println(new String(chars, 0, len));
        }

        inputStreamReader.close();

    }
}
