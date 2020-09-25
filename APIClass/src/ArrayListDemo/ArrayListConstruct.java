package ArrayListDemo;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListConstruct {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        System.out.println(strings); // []

        strings.add("hello");
        strings.add("my");
        strings.add("life");

        System.out.println(strings); // [hello, my, life]

        strings.add(1, "this");

        System.out.println(strings); //[hello, this, my, life]

        // strings.add(10, "error"); // 报错 IndexOutOfBoundsException


        ArrayList<String> al1 = new ArrayList<>();
        al1.add("one");
        al1.add("two");
        al1.add("three");
        al1.add("four");
        al1.add("five");

        // System.out.println(al1.remove("three")); // true
        // System.out.println(al1); // [one, two, four, five]

        // System.out.println(al1.remove("aaa")); // false
        // System.out.println(al1); // [one, two, three, four, five]

        // System.out.println(al1.remove(1)); // two
        // System.out.println(al1); // [one, three, four, five]

        // System.out.println(al1.remove(10)); // 报错IndexOutOfBoundsException

        // System.out.println(al1.set(1, "setWord")); // two
        // System.out.println(al1); // [one, setWord, three, four, five]

        // System.out.println(al1.set(6, "setError")); // 报错 IndexOutOfBoundsException

        // System.out.println(al1.get(1)); // two
        // System.out.println(al1.get(6)); //报错 IndexOutOfBoundsException

        System.out.println(al1.size()); // 5


        for (int i = 0; i < al1.size(); i++) {
            String s = al1.get(i);
            System.out.println(s);

        }
        //one
        //two
        //three
        //four
        //five

        ArrayList<Student> studentsList = new ArrayList<>();
        studentsList.add(new Student("one", 18));
        studentsList.add(new Student("three", 19));
        studentsList.add(new Student("four", 20));

        System.out.println(studentsList);
        for (int i = 0; i < studentsList.size(); i++) {
            Student student = studentsList.get(i);
            System.out.println("姓名" + student.getName() + " 年龄" + student.getAge());
        }
        ArrayList<Student> students = new ArrayList<>();
        addStudent(students);
        addStudent(students);
        addStudent(students);
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            System.out.println("姓名" + student.getName() + " 年龄" + student.getAge());
        }

    }


    public static void addStudent(ArrayList<Student> studentList) {
        Student student = new Student();
        System.out.println("请输入姓名");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("请输入年龄");
        Scanner scanner1 = new Scanner(System.in);
        int age = scanner1.nextInt();
        student.setName(name);
        student.setAge(age);
        studentList.add(student);

    }
}
