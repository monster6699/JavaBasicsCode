package demo03;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamSortedDemo {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("one");
        strings.add("two");
        strings.add("three");
        strings.add("four");
        strings.add("five");
        System.out.println(strings);

        // 自然排序
        Stream<String> sortedStream = strings.stream().sorted();
        System.out.println(sortedStream.collect(Collectors.toList())); //[five, four, one, three, two]

        // 根据长度进行排序
        Stream<String> sortedLenStream = strings.stream().sorted((s1, s2) -> s2.length() - s1.length());
        System.out.println(sortedLenStream.collect(Collectors.toList())); // [three, four, five, one, two]

       // 根据长度排序后再根据字母进行排序
        Stream<String> sortedLenStream1 = strings.stream().sorted((s1, s2) -> {
            int num = s2.length() - s1.length();
            int i = num == 0 ? s1.compareTo(s2) : num;
            return i;
        });
        System.out.println(sortedLenStream1.collect(Collectors.toList())); //[three, five, four, one, two]


    }
}
