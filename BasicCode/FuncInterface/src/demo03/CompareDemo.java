package demo03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CompareDemo {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("bbbb");
        strings.add("aa");
        strings.add("ccc");
        System.out.println(strings);
//        Collections.sort(strings, useComaprator());
//        System.out.println(strings);

        Collections.sort(strings, (s1, s2) -> s1.length() - s2.length());

        System.out.println(strings);
    }

    public static Comparator<String> useComaprator() {
        Comparator<String> comparator = new Comparator<>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();
            }
        };
//        return comparator;
        return (s1, s2) -> s1.length() - s2.length();
    }
}
