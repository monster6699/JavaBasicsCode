package demo07;

public interface MyInterface {

    private void defautMethod() {
        System.out.println("hello");
        System.out.println("private");
        System.out.println("method");
    }

    private static void staticMethod() {
        System.out.println("hello");
        System.out.println("private");
        System.out.println("method");
    }

    default void defaultMethod1() {
        System.out.println("start default 1");
        defautMethod();
//        staticMethod(); // 默认的方法可以使用静态的私有方法
        System.out.println("end default 1");
    }

    default void defaultMethod2() {
        System.out.println("start default 2");
        defautMethod();
        System.out.println("end default 2");
    }

    static void staticMethod1() {
        System.out.println("start static 1");
        staticMethod();
        System.out.println("end static 1");
    }

    static void staticMethod2() {
        System.out.println("start static 2");
        staticMethod();
        // defautMethod(); // 静态方法不能使用默认的私有方法
        System.out.println("end static 2");
    }
}
