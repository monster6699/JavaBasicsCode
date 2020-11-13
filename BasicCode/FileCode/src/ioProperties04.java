import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class ioProperties04 {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        FileReader fileReader = new FileReader("FileCode/game.txt");
        properties.load(fileReader);
        fileReader.close();
        String count = properties.getProperty("count");
        int i = Integer.parseInt(count);
        if (i> 3) {
            System.out.println("游戏次数超过三次，已结束");
        } else {
            System.out.println("游戏进行中。。。。。。。。。。");
            i++;
            properties.setProperty("count", String.valueOf(i));
            FileWriter fileWriter = new FileWriter("FileCode/game.txt");
            properties.store(fileWriter, "games count");
            fileWriter.close();

        }


    }
}
