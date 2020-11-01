package demo10;

public class MyInterfacMain {
    public static void main(String[] args) {

        // 类名内部类实现
        useCovert(new MyInterface() {
            @Override
            public String convert(String s) {
                return s.toUpperCase();
            }
        });

        // lambda表达式实现
        useCovert(s -> s.toUpperCase());

        // 引用类对象的实例方法实现
        StringToUpperCase stringToUpperCase = new StringToUpperCase();
        useCovert(stringToUpperCase::upperCase);


        // 引用类的实例方法实现
        useCovert(String::toUpperCase);

        // 引用类的实例方法实现
        useSubCovert(String::substring);

    }

    public static void useCovert(MyInterface myInterface) {
        String convert = myInterface.convert("helloMyLove");
        System.out.println(convert);
    }

    public static void useSubCovert(MySubInterface mySubInterface) {
        String sdfgfhjhfd = mySubInterface.toSubString("sdfgfhjhfd", 1, 5);
        System.out.println(sdfgfhjhfd);
    }
}
