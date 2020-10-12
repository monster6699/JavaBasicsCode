package demo01;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> setData = new HashSet<>();
        setData.add("aa");
        setData.add("ff");
        setData.add("hello");
        setData.add("world");
        setData.add("java");
        setData.add("hihi");
        System.out.println(setData); //[aa, bb, cc]
        System.out.println(setData.hashCode());
        Set<String> setData1 = new HashSet<>();
        System.out.println(setData1.hashCode());
        System.out.println("aa".hashCode());
        System.out.println("aa".hashCode());
        System.out.println("bb".hashCode());

        HashSet<String> strings = new HashSet<>();
        strings.add("aa");
        strings.add("bb");
        strings.add("cc");
        strings.add("dd");
        strings.add("ee");
        strings.add("ff");
        strings.add("ff");
        strings.add("hello");
        strings.add("world");
        strings.add("java");
        System.out.println(strings); // [aa, bb, cc, dd, ee, ff, world, java, hello]




    }
}
