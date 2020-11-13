import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ioDemo07 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("FileCode/a.txt");

        byte[] bt = new byte[7];
//        int read = fileInputStream.read(bt);
//        System.out.println(read);
//        System.out.print(new String(bt, 0, read));
//
//        read = fileInputStream.read(bt);
//        System.out.println(read);
//        System.out.print(new String(bt, 0, read));
//
//        read = fileInputStream.read(bt);
//        System.out.println(read);
//        System.out.print(new String(bt, 0, read));
//
//        read = fileInputStream.read(bt);
//        System.out.println(read);
        int len;
        while ((len = fileInputStream.read(bt)) != -1) {
            System.out.print(new String(bt, 0, len));
        }




    }
}
