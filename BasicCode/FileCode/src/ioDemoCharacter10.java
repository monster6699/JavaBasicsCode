import java.io.*;

public class ioDemoCharacter10 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("FileCode/ioDemoCharacter04.java"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("FileCode/copy.java"));
        String s;
        while ((s=bufferedReader.readLine()) != null) {
            bufferedWriter.write(s);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
