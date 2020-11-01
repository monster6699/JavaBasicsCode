package demo01;

public class MyInterfaceMain {
    public static void main(String[] args) {
        MyInterface myInterface = () -> System.out.println("吃饭饭");
        myInterface.eat();
    }
}
