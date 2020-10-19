import java.io.*;

public class ioPractice08 {
    public static void main(String[] args) throws IOException {
        File file = new File("C://Download/javaFile");
        File toFile = new File("FileCode");
        copyDir(file, toFile);
    }

    private static void copyDir(File sourceFile, File toFile) throws IOException {
        String fileName = sourceFile.getName();
        File filCode = new File(toFile, fileName);
        if(!filCode.exists()) {
            filCode.mkdir();
        }
        File[] files = sourceFile.listFiles();
        for (File file : files) {
            if(file.isFile()) {
                File file1 = new File(filCode, file.getName());
                copyFile(file, file1);
            } else {
                copyDir(file, filCode);
            }
        }
    }

    private static void copyFile(File file, File file1) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file1));
        byte[] bytes = new byte[1024];
        int len;
        while ((len=bufferedInputStream.read()) != -1){
            bufferedOutputStream.write(bytes, 0, len);
        }
        bufferedInputStream.close();
        bufferedOutputStream.close();
    }
}
