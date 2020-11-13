import java.io.File;
import java.io.IOException;

public class demo04 {
    public static void main(String[] args) throws IOException {
        File file = new File("FileCode/a.txt");
        System.out.println(file.createNewFile());
        System.out.println(file.delete());


        File file1 = new File("FileCode/TestDir");
        System.out.println(file1.mkdir());
        File file2 = new File("FileCode/TestDir/at.txt");
        System.out.println(file2.createNewFile());

        // 先删除目录中的文件再删除目录，否则报错
        System.out.println(file2.delete());
        System.out.println(file1.delete());




    }
}
