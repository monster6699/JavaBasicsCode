import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ioDemo02 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("FileCode/b.txt");
        // 方式2
//        byte [] b = {97, 98, 99, 100, 101, 102};
//        fileOutputStream.write(b);
        // 方式2
        byte[] bytes = "sdfghjkjhgf".getBytes();
        fileOutputStream.write(bytes);
        fileOutputStream.close();
    }
}
