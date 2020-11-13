package demo01;

import java.util.LinkedHashSet;

public class LinkSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> strings = new LinkedHashSet<>();
        strings.add("hello");
        strings.add("world");
        strings.add("java");
        strings.add("hello");
        System.out.println(strings);

    }
}
