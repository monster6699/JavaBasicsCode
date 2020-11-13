package demo2;

public interface InterfaceDemo01 {
    public abstract void interface01();

    public abstract void method();

    public default void defaultMethod(){
        System.out.println("InterfaceDemo01 defaultMethod");
    }
}
