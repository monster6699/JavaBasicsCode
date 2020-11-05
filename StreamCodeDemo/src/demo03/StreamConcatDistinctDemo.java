package demo03;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamConcatDistinctDemo {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("one");
        strings.add("two");
        strings.add("three");
        strings.add("four");
        strings.add("five");
        System.out.println(strings);

        Stream<String> limitStream = strings.stream().limit(4);
        Stream<String> skipStream = strings.stream().skip(2);

        //concat 拼接
        Stream<String> concatStream = Stream.concat(limitStream, skipStream);
//        System.out.println(concatStream.collect(Collectors.toList())); //[one, two, three, four, three, four, five]

        // distinct 去重
        Stream<String> distinctStream = concatStream.distinct();
        System.out.println(distinctStream.collect(Collectors.toList())); //[one, two, three, four, five]
    }
}
