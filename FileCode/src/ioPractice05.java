import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ioPractice05 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("FileCode/b.txt"));
        ArrayList<Student> students = new ArrayList<>();
        String s;
        while ((s=bufferedReader.readLine()) != null) {
            String[] split = s.split(",");
            Student student = new Student(split[0], split[1], Integer.parseInt(split[2]), split[3]);
            students.add(student);
        }
        bufferedReader.close();

        for (Student stu :
                students) {
            System.out.println(stu.getNid()+","+ stu.getName() + "," + stu.getAge() + "," + stu.getAddress());
        }
    }

}
