import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class ioDemoCharacter03 {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream("FileCode/c.txt"));
        // 方式1
        outputStreamWriter.write(97);
        outputStreamWriter.flush();
        outputStreamWriter.write(98);
        outputStreamWriter.flush();

        char[] c = {97, 98, 99, 100, 101};
        // 方式2
        outputStreamWriter.write(c);
        // 方式3
        outputStreamWriter.write(c, 0 , 3);
        outputStreamWriter.flush();

        outputStreamWriter.close();

        OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(new FileOutputStream("FileCode/d.txt"));
        // 方式4
        outputStreamWriter2.write("asdfdgfhgjkl;\r\n");
        // 方式5
        outputStreamWriter2.write("asdfdgfhgjkl;", 1 , 5);
        outputStreamWriter2.flush();




    }
}
