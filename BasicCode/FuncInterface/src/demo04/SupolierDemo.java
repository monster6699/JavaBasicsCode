package demo04;

import java.util.function.Supplier;

public class SupolierDemo {
    public static void main(String[] args) {
        String string = getString(new Supplier<String>() {
            @Override
            public String get() {
                return "hello";
            }
        });

        System.out.println(string);

        String string1 = getString(() -> "hello func");
        System.out.println(string1);


        Integer integer = getInteger(() -> 6699);
        System.out.println(integer);


    }

    public static String getString(Supplier<String> supplier) {
        return supplier.get();
    }

    public static Integer getInteger(Supplier<Integer> supplier) {
        return supplier.get();
    }
}
