import java.io.*;

public class ioDemo10 {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();


//        method1();//共耗时199139秒
//        method2();//共耗时339秒
//        method3();//共耗时474秒
//        method4();//共耗时103秒
        long end = System.currentTimeMillis();
        System.out.println("共耗时" + (end - start) + "秒");
    }

    public static void method1() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("C://Download/video.vep");
        FileOutputStream fileOutputStream = new FileOutputStream("FileCode/videoCopy.vep");
        int len;
        while ((len = fileInputStream.read()) != -1) {
            fileOutputStream.write(len);
        }

        fileInputStream.close();
        fileOutputStream.close();
    }

    public static void method2() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("C://Download/video.vep");
        FileOutputStream fileOutputStream = new FileOutputStream("FileCode/videoCopy.vep");
        byte[] bt = new byte[1024];
        int len;
        while ((len = fileInputStream.read(bt)) != -1) {
            fileOutputStream.write(bt, 0, len);
        }
        fileInputStream.close();
        fileOutputStream.close();
    }

    public static void method3() throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("C://Download/video.vep"));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("FileCode/videoCopy.vep"));
        int len;
        while ((len = bufferedInputStream.read()) != -1) {
            bufferedOutputStream.write(len);
        }

        bufferedInputStream.close();
        bufferedOutputStream.close();
    }


    public static void method4() throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("C://Download/video.vep"));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("FileCode/videoCopy.vep"));
        byte[] bt = new byte[1024];
        int len;
        while ((len = bufferedInputStream.read(bt)) != -1) {
            bufferedOutputStream.write(bt, 0, len);
        }
        bufferedInputStream.close();
        bufferedOutputStream.close();
    }
}
