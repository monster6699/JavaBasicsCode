import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ioPractice01 {
    public static void main(String[] args) throws IOException {
        // 集合到文件
        ArrayList<String> strings = new ArrayList<>();
        strings.add("one");
        strings.add("two");
        strings.add("three");
        strings.add("four");
        strings.add("five");

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("FileCode/a.txt"));
        for (String s :
                strings) {
            bufferedWriter.write(s);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }

        bufferedWriter.close();
    }
}
