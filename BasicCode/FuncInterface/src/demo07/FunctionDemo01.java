package demo07;

import java.util.function.Function;

public class FunctionDemo01 {
    public static void main(String[] args) {
//        convert("1314", s -> Integer.parseInt(s));
        convertToInt("1314", Integer::parseInt);
        convertToStr(1314, i -> String.valueOf(i + 520));

        convert("1314", Integer::parseInt, i -> String.valueOf(i + 520));


    }

    //把字符串转成整数
    private static void convertToInt(String s, Function<String, Integer> fun) {
        Integer i = fun.apply(s);
        System.out.println(i);
    }

    // 把整数转成字符串
    private static void convertToStr(int i, Function<Integer, String> fun) {
        String s = fun.apply(i);
        System.out.println(s);
    }

    // 综合写
    private static void convert(String s, Function<String, Integer> fun1, Function<Integer, String> fun2) {
        String apply = fun1.andThen(fun2).apply(s);
        System.out.println(apply);
    }

}
