import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class ioProperties03 {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        FileWriter fileWriter = new FileWriter("FileCode/store.txt");
        properties.setProperty("001", "陈虎");
        properties.setProperty("002", "尚玲");
        properties.store(fileWriter, "this is double people");
        fileWriter.close();

        FileReader fileReader = new FileReader("FileCode/store.txt");
        properties.load(fileReader);
        System.out.println(properties);


    }
}
