package demo11;

public class StudentMain {
    public static void main(String[] args) {
        // 匿名内部类
        useStudentBuld(new StudentBuild() {
            @Override
            public Student build(String name, int age) {
                return new Student(name, age);
            }
        });

        // lambda表达式
        useStudentBuld(((name, age) -> new Student(name, age)));


        // 引用构造器
        useStudentBuld(Student::new);

    }
    public  static void useStudentBuld(StudentBuild studentBuild) {
        Student s = studentBuild.build("sun", 1314);
        System.out.println(s.getName() + ", " + s.getAge());
    }
}
