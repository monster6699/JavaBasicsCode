package demo09;

public class MyInterfacMain {
    public static void main(String[] args) {
        // 类名内部类实现
        useCovert(new MyInterface() {
            @Override
            public int convert(String s) {
                return Integer.parseInt(s);
            }
        });

        // lambda表达式实现
        useCovert(s -> Integer.parseInt(s));

        // 引用类(静态)方法实现
        useCovert(Integer::parseInt);
    }
    public static void useCovert(MyInterface myInterface) {
        int convert = myInterface.convert("6699");
        System.out.println(convert);
    }
}
