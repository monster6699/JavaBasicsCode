package demo08;

public class MyInterfacMain {
    public static void main(String[] args) {
        // 类名内部类实现
        usePrintStr(new MyInterface() {
            @Override
            public void printStr(String s) {
                System.out.println(s);
            }
        });

        // lambda表达式实现
        usePrintStr(s -> System.out.println("lambda表达式实现" + s));

        // 引用实现
        usePrintStr(System.out::println);
    }
    public static void usePrintStr(MyInterface myInterface) {
        myInterface.printStr("hello");
    }
}
