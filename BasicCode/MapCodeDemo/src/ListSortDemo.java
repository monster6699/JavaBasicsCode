import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListSortDemo {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("张三", 20));
        students.add(new Student("李四", 16));
        students.add(new Student("王二", 30));
        students.add(new Student("麻子", 21));
        students.add(new Student("圣达菲", 21));

        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num = s1.getAge() - s2.getAge();
                int num2 = num == 0 ? s1.getName().compareTo(s2.getName()) : num;
                return num2;
            }
        });

        for (Student stu :
                students) {
            System.out.println(stu.getName() + ", " + stu.getAge());
        }
    }
}

