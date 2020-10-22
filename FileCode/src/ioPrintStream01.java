
import java.io.*;

public class ioPrintStream01 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("FileCode/ioDemoCharacter04.java"));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("FileCode/copy.java"));
//        String s;
//        while ((s=bufferedReader.readLine()) != null) {
//            bufferedWriter.write(s);
//            bufferedWriter.newLine();
//            bufferedWriter.flush();
//        }
//
//        bufferedReader.close();
//        bufferedWriter.close();
        PrintWriter printWriter = new PrintWriter(new FileWriter("FileCode/copy.java"), true);
        String s;
        while ((s=bufferedReader.readLine()) != null) {
            printWriter.println(s);
        }

        printWriter.close();
        bufferedReader.close();
    }
}
