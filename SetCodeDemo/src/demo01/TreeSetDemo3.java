package demo01;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo3 {
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num = s1.getAge() - s2.getAge();
                int num2 = num == 0 ? s1.getName().compareTo(s2.getName()) : num;
                return num2;
            }
        });

        students.add(new Student("张三", 20));
        students.add(new Student("李四", 18));
        students.add(new Student("王五", 22));
        for (Student stu :
                students) {
            System.out.println("name: " + stu.getName() + "  age: " + stu.getAge());
        }

    }
}
