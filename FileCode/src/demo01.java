import java.io.File;

public class demo01 {

    public static void main(String[] args) {
        File file = new File("C://Download/a.txt");
        System.out.println(file); // C:\Download\a.txt

        File file1 = new File("C://Download", "a.txt");
        System.out.println(file1); //C:\Download\a.txt

        File file2 = new File("C://Download");
        File file3 = new File(file2, "a.txt");
        System.out.println(file3);// C:\Download\a.txt
    }
}
