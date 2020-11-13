package demo2;

public interface InterfaceDemo02 {
    public abstract void interface02();
    public abstract void method();
    public default void defaultMethod() {
        System.out.println("interfaceDemo02 defaultMethod");
    }
}
