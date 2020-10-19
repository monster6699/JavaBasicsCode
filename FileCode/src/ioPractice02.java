import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ioPractice02 {
    public static void main(String[] args) throws IOException {
        // 文件到集合
        BufferedReader bufferedReader = new BufferedReader(new FileReader("FileCode/a.txt"));
        ArrayList<String> strings = new ArrayList<>();
        String s;
        while ((s=bufferedReader.readLine()) != null) {
            strings.add(s);
        }
        bufferedReader.close();
        System.out.println(strings);



    }

}
