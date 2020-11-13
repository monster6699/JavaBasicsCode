package demo01;

public class Student2 implements Comparable<Student2> {
    private String name;
    private int age;

    public Student2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Student2 s) {
        int num = this.getAge() - s.getAge();
        int setNum  = num == 0 ? this.getName().compareTo(s.getName()) : num;
        return setNum;
//        return 1;
//        return -1;
    }
}
