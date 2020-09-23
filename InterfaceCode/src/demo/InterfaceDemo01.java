package demo;

public interface InterfaceDemo01 {
    public abstract void eat();
    public default void sleep1() {
        System.out.println("this is default sleeping1");
        commenDefault();
    }

    public default void sleep2() {
        System.out.println("this is default sleeping2");
        commenDefault();
    }

    // static
    public static void work1() {
        System.out.println("this is static working1");

    }
    public static void work2() {
        System.out.println("this is static working2");
        commenStatic();
    }
    // static common
    private static void commenStatic() {
        System.out.println("this is commen static method");
    }

    // default common
    private void commenDefault() {
        System.out.println("this is commen default method");
    }
}
