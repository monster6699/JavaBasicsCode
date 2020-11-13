import java.io.*;

public class ioDemoCharacter02 {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream("FileCode/a.txt"));
        outputStreamWriter.write("中国6666");
        outputStreamWriter.close();

        OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(new FileOutputStream("FileCode/b.txt"), "GBK");
        outputStreamWriter2.write("中国6666");
        outputStreamWriter2.close();


        InputStreamReader readerStr = new InputStreamReader(new FileInputStream("FileCode/b.txt"), "GBK");
        int len;
        while ((len=readerStr.read()) != -1) {
            System.out.print((char)len);
        }



    }
}
