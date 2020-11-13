package demo07;

public class MyInterfaceMain {
    public static void main(String[] args) {
        MyInterfaceImp myInterfaceImp = new MyInterfaceImp();
        myInterfaceImp.defaultMethod1();
        System.out.println("----------------------------------------------------");
        myInterfaceImp.defaultMethod2();
        System.out.println("----------------------------------------------------");
        MyInterface.staticMethod1();
        System.out.println("----------------------------------------------------");
        MyInterface.staticMethod2();
    }
}
