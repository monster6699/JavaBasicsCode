import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class ioDemoCharacter01 {
    public static void main(String[] args) throws FileNotFoundException {
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("FileCode/a.txt"));
    }
}
