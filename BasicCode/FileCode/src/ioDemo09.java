import java.io.*;

public class ioDemo09 {
    public static void main(String[] args) throws IOException {
//        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("FileCode/c.txt"));
//        bufferedOutputStream.write("helllo\r\n".getBytes());
//        bufferedOutputStream.write("world\r\n".getBytes());
//        bufferedOutputStream.write("java\r\n".getBytes());
//        bufferedOutputStream.close();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("FileCode/c.txt"));
        byte[] bt = new byte[1024];
        int len;
        while ((len=bufferedInputStream.read(bt)) != -1) {
            System.out.println(new String(bt, 0, len));
        }

        bufferedInputStream.close();
    }
}
