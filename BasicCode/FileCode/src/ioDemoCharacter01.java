import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class ioDemoCharacter01 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "中国您好";

        byte[] bytes = s.getBytes(); // 默认utf-8
        System.out.println(Arrays.toString(bytes));
        String s1 = new String(bytes, "UTF-8");
        System.out.println(s1);


        String gbk = new String(bytes, "GBK");
        System.out.println(gbk); // 乱码

        byte[] bt = s.getBytes("GBK");
        String gbk1 = new String(bt, "GBK");
        System.out.println(gbk1);


    }
}
