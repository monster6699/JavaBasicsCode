package demo03;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamToMapDemo {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("one,10");
        strings.add("two,20");
        strings.add("three,30");
        strings.add("four,40");
        strings.add("five,50");
        Stream<String> stringStream = strings.stream().filter(s -> Integer.parseInt(s.split(",")[1]) >= 30);
        Map<String, Integer> collect = stringStream.collect(Collectors.toMap(s -> s.split(",")[0], s -> Integer.parseInt(s.split(",")[1])));
        System.out.println(collect);
    }
}
