package demo01;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo4 {
    public static void main(String[] args) {
        TreeSet<Student4> student4s = new TreeSet<>(new Comparator<Student4>() {
            @Override
            public int compare(Student4 s1, Student4 s2) {
                int num = s2.getSum() - s1.getSum();
                int num2 = num == 0 ? s2.getChinese() - s1.getChinese() : num;
                int num3 = num2 == 0 ? s1.getName().compareTo(s2.getName()) : num2;
                return num3;
            }
        });
        student4s.add(new Student4("zerol", 100, 100));
        student4s.add(new Student4("moster", 30, 40));
        student4s.add(new Student4("beutiful", 50, 80));

        for (Student4 stu :
                student4s) {
            System.out.println(stu.getName() + "," + stu.getChinese() + "," + stu.getMath() + "," + stu.getSum());
        }

    }
}
