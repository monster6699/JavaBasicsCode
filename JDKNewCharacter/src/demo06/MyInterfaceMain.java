package demo06;

import demo05.MyInterfaceImpl;

public class MyInterfaceMain {
    public static void main(String[] args) {
        MyInterfacImp myInterfacImp = new MyInterfacImp();

        myInterfacImp.eat();
        myInterfacImp.sleep();
//        myInterfacImp.play(); 静态方法不能直接通过实列去调用
//        MyInterfaceImpl.play();
        MyInterface.play();
    }
}
