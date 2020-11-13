import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ioDemo03 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("FileCode/a.txt", true); // 追加写入
        for (int i = 0; i < 5 ; i++) {
            fileOutputStream.write("hello".getBytes());
            fileOutputStream.write("\r\n".getBytes()); // 换行
        }
        fileOutputStream.close();
    }
}
