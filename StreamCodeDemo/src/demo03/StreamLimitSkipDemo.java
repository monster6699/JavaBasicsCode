package demo03;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamLimitSkipDemo {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("one");
        strings.add("two");
        strings.add("three");
        strings.add("four");
        strings.add("five");
        System.out.println(strings);

        // stream流limit的使用
        strings.stream().limit(2).forEach(System.out::println);
        // stream流skip的使用
        strings.stream().skip(2).forEach(System.out::println);

        //综合使用，并使用collect把stream流收集成List
        Stream<String> stream = strings.stream().limit(4).skip(2);
        List<String> collect = stream.collect(Collectors.toList());
        System.out.println(collect);


    }
}
