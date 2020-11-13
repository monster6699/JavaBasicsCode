import java.io.*;

public class ioDemoCharacter09 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("FileCode/ioDemoCharacter04.java"));
        String str;
        while ((str=bufferedReader.readLine()) != null) {
            System.out.println(str);
        }
        bufferedReader.close();
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("FileCode/a.txt"));
        for (int i = 0; i < 10; i++) {
            bufferedWriter.write("hell0" + i);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }

        bufferedWriter.close();




    }
}
