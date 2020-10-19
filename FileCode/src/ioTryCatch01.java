import java.io.*;

public class ioTryCatch01 {
    public static void main(String[] args) {
        method1();
    }

    private static void method1() {
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        try{
            bufferedReader = new BufferedReader(new FileReader("FileCode/ioDemoCharacter04.java"));
            bufferedWriter = new BufferedWriter(new FileWriter("FileCode/copy.java"));
            String s;
            while ((s=bufferedReader.readLine()) != null) {
                bufferedWriter.write(s);
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

    }
    // JDK7
    private static void method2() {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("FileCode/ioDemoCharacter04.java"));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("FileCode/copy.java"));){
            String s;
            while ((s=bufferedReader.readLine()) != null) {
                bufferedWriter.write(s);
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    // JDK9
    private static void method3() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("FileCode/ioDemoCharacter04.java"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("FileCode/copy.java"));
        try(bufferedReader;bufferedWriter){
            String s;
            while ((s=bufferedReader.readLine()) != null) {
                bufferedWriter.write(s);
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
