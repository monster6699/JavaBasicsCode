import java.io.FileOutputStream;
import java.io.IOException;

public class ioDemo04 {
    public static void main(String[] args) {
        FileOutputStream fileOutputStream = null;
        try {

            fileOutputStream = new FileOutputStream("FileCode/a.txt", true); // 追加写入
            for (int i = 0; i < 5; i++) {
                fileOutputStream.write("hello".getBytes());
                fileOutputStream.write("\r\n".getBytes()); // 换行
            }
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


}
