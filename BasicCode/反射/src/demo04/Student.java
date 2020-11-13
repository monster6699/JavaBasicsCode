package demo04;

public class Student {
    private String name;
    int age;
    public String address;

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String address) {
        this.address = address;
    }

    public Student() {
    }

    public void method1() {
        System.out.println("method1----------");
    }


    private void method2() {
        System.out.println("method2----------");
    }

    public void method3(String name) {
        System.out.println(name);
    }

    public String  method4(String name, int age) {
        return name + "," + age;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
