import java.io.*;

public class ioDemoCharacter08 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("FileCode/ioDemoCharacter04.java"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("FileCode/copy.java"));

        // 方式1
//        int ch;
//        while ((ch=bufferedReader.read()) != -1) {
//            bufferedWriter.write(ch);
//        }

        // 方式2
        char[] chars = new char[1024];
        int len;
        while ((len=bufferedReader.read(chars)) != -1) {
            bufferedWriter.write(chars, 0, len);
        }

        bufferedReader.close();
        bufferedWriter.close();



    }
}
