package demo01;

import java.util.TreeSet;

public class TreeSetDemo2 {
    public static void main(String[] args) {
        TreeSet<Student2> student2s = new TreeSet<>();
        student2s.add(new Student2("one", 10));
        student2s.add(new Student2("three", 30));
        student2s.add(new Student2("two", 20));
        student2s.add(new Student2("two", 10));
        for (Student2 stu : student2s) {
            System.out.println("name: " + stu.getName() + "   " + "age: " + stu.getAge());
        }
    }
}
