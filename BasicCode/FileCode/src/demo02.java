import java.io.File;
import java.io.IOException;

public class demo02 {
    public static void main(String[] args) throws IOException {
        File file = new File("C://Download/a.txt");
        System.out.println(file.createNewFile()); //成功：true 失败：false

        File file1 = new File("C://Download/testDir");
        System.out.println(file1.mkdir()); //成功：true 失败：false

        File file2 = new File("C://Download/dirs/testDir");
        System.out.println(file2.mkdirs()); //成功：true 失败：false

        File file3 = new File("C://Download/bb/a.txt");
        System.out.println(file3.createNewFile()); //失败：false




    }
}
