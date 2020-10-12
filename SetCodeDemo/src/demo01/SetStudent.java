package demo01;

import java.util.HashSet;

public class SetStudent {
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<>();
        Student stu1 = new Student("爱奇艺", 20);
        Student stu2 = new Student("腾讯视频", 21);
        Student stu3 = new Student("腾讯视频", 21);
        students.add(stu1);
        students.add(stu2);
        students.add(stu3);

        for (Student stu : students) {
            System.out.println("name: " + stu.getName() + "   " + "age: " + stu.getAge());
        }

    }
}