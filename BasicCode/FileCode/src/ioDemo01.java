import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ioDemo01 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("FileCode/a.txt");
        fileOutputStream.write(97);
        fileOutputStream.write(98);
        fileOutputStream.write(99);
        fileOutputStream.write(100);
        fileOutputStream.close();
    }
}
