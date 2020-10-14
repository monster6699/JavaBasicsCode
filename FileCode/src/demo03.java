import java.io.File;
import java.util.Arrays;

public class demo03 {
    public static void main(String[] args) {
        File file = new File("C://Download/javaFile");
        System.out.println(file.isFile()); // 是否是文件
        System.out.println(file.isDirectory()); // 是否目录
        System.out.println(file.exists()); // 是否存在

        System.out.println(file.getAbsolutePath()); // 获取绝对路径
        System.out.println(file.getPath()); // 将抽象路径转换成路径字符串
        System.out.println(file.getName()); /// 获取路径名称或者目录名称

        String[] list = file.list();
        System.out.println(Arrays.toString(list));
        File[] files = file.listFiles();
        for (File fe :
                files) {
            if (fe.isFile()) {
                System.out.println(fe.getName());
            }
        }

    }
}
