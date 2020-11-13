import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class ioPractice03 {
    public static void main(String[] args) throws IOException {
        // 点名器
        BufferedReader bufferedReader = new BufferedReader(new FileReader("FileCode/a.txt"));
        ArrayList<String> strings = new ArrayList<>();
        String s;
        while ((s=bufferedReader.readLine()) != null) {
            strings.add(s);
        }

        bufferedReader.close();
        Random random = new Random();
        int i = random.nextInt(strings.size());
        System.out.println(strings.get(i));
    }
}
