package demo07;

import java.util.function.Function;

public class FunctionDemo02 {
    public static void main(String[] args) {
        String ss = "monster,60";
        convert(ss, s -> s.split(",")[1], Integer::parseInt, i -> i + 40);

    }
    // 提取年龄，转成整型数， 加上40
    private static void convert(String s, Function<String, String> fun1, Function<String, Integer> fun2, Function<Integer, Integer> fun3) {
        Integer i = fun1.andThen(fun2).andThen(fun3).apply(s);
        System.out.println(i);
    }
}
