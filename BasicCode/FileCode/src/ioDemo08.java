import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ioDemo08 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("C://Download/a.jpg");
        FileOutputStream fileOutputStream = new FileOutputStream("FileCode/a.jpg");
        byte[] bt = new byte[1024];
        int len;
        while ((len=fileInputStream.read(bt)) != -1) {
            fileOutputStream.write(bt, 0, len);
        }
        fileInputStream.close();
        fileOutputStream.close();
    }
}
