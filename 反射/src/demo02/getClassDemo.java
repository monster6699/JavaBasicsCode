package demo02;

public class getClassDemo {
    /*
    1.使用类的class属性来获取该类对应的Class对象。举例：Student.class将会返回Student类对应的Class对象
    2.调用对象的getClass()方法，返回该对象所属类对应的Class对象 该方法是Object类中的方法，所有的Java对象都可以调用该方法
    3.使用Class类中的静态方法forName(String className)，该方法需要传入字符串参数，该字符串参数的值是某个类的全路径，也就是完整包名的路径

     */
    public static void main(String[] args) throws ClassNotFoundException {
        // 方式1
        Class<Student> studentClass = Student.class;
        System.out.println(studentClass); //class demo02.Student

        // 方式2
        Student student = new Student();
        Class<? extends Student> aClass = student.getClass();
        System.out.println(aClass); //class demo02.Student

        // 方式3
        Class<?> aClass1 = Class.forName("demo02.Student");
        System.out.println(aClass1); //class demo02.Student


    }
}
