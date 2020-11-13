import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ioDemo06 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("FileCode/a.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("FileCode/b.txt");
        int readBy;
        while ((readBy = fileInputStream.read()) != -1) {
            fileOutputStream.write(readBy);
        }

        fileInputStream.close();
        fileOutputStream.close();
    }
}
