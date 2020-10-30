package demo05;

public class MyInterfaceMain {
    public static void main(String[] args) {
        MyInterfaceImpl myInterface = new MyInterfaceImpl();
        myInterface.show1();
        myInterface.show2();
        myInterface.show3(); //默认方法，实现类中并没有重写show3

    }
}
