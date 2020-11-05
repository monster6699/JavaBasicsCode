package demo03;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamForEachCountDemo {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("one");
        strings.add("two");
        strings.add("three");
        strings.add("four");
        strings.add("five");
        System.out.println(strings);

        // forEach
        strings.stream().filter(s->s.startsWith("f")).forEach(System.out::println);

        // count
        long count = strings.stream().filter(s -> s.startsWith("f")).count();
        System.out.println(count);

    }
}
