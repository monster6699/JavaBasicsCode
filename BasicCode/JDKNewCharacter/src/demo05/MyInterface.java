package demo05;

public interface MyInterface {
    void show1();
    void show2();
    default void show3() {
        System.out.println("接口中的默认方法show3()");
    }
}
