import java.io.*;

public class ioDemoCharacter07 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("FileCode/ioDemoCharacter04.java"));
        // 方式1
        int ch;
        while ((ch=bufferedReader.read()) != -1) {
            System.out.print((char) ch);
        }
        // 方式2
        char[] chars = new char[1024];
        int len;
        while ((len=bufferedReader.read(chars)) != -1) {
            System.out.print(new String(chars, 0, len));
        }

        bufferedReader.close();


        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("FileCode/e.txt"));
        bufferedWriter.write("hello\r\n人生自古谁无死\r\n留取丹心照汗青");
        bufferedWriter.close();

    }
}
