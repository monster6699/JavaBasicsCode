import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ioDemo05 {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("FileCode/a.txt");
            int read;
            while ( (read = fileInputStream.read()) != -1){
                System.out.print((char) read);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
