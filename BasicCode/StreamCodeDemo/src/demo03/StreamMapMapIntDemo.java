package demo03;

import java.util.ArrayList;

public class StreamMapMapIntDemo {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("11");
        strings.add("22");
        strings.add("33");
        strings.add("44");
        strings.add("55");
        // map
        strings.stream().map(Integer::parseInt).forEach(System.out::println);

        // mapToInt能够计算总和sum
        strings.stream().mapToInt(Integer::parseInt).forEach(System.out::println);
        long count = strings.stream().mapToInt(Integer::parseInt).sum();
        System.out.println(count);


    }
}
