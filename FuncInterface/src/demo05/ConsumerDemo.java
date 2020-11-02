package demo05;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
//        getCounsumerString("hello sun", s -> System.out.println(s));
//        getCounsumerString("dfs", System.out::println);
//        getCounsumerString("sdfg", s->{
//            System.out.println(new StringBuilder(s).reverse().toString());
//        });
//        getCounsumerString("dfsdgjhjh", s-> System.out.println(new StringBuilder(s).reverse().toString()));

        getCounsumerString("hello",System.out::println, s-> System.out.println(new StringBuilder(s).reverse().toString()));
    }


    private static void getCounsumerString(String name, Consumer<String> consumer) {
        consumer.accept(name);
    }

    private static void getCounsumerString(String name, Consumer<String> consumer1, Consumer<String> consumer2) {
//        consumer1.accept(name);
//        consumer2.accept(name);

        consumer1.andThen(consumer2).accept(name);
    }
}

