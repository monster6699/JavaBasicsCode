package demo01;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> setData = new HashSet<>();
        setData.add("aa");
        setData.add("bb");
        setData.add("cc");
        setData.add("aa");
        System.out.println(setData); //[aa, bb, cc]
        System.out.println(setData.hashCode());
        Set<String> setData1 = new HashSet<>();
        System.out.println(setData1.hashCode());
        System.out.println("aa".hashCode());
        System.out.println("bb".hashCode());


    }
}
