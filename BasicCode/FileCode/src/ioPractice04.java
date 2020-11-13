import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ioPractice04 {
    public static void main(String[] args) throws IOException {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("001", "爱奇艺", 10, "深圳"));
        students.add(new Student("002", "腾讯", 15, "北京"));
        students.add(new Student("003", "优酷", 10, "上海"));


        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("FileCode/b.txt"));
        for (Student stu :
                students) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(stu.getNid()).append(",").append(stu.getName()).append(",").append(stu.getAge()).append(",").append(stu.getAddress());
            bufferedWriter.write(stringBuilder.toString());
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }

        bufferedWriter.close();
    }
}
