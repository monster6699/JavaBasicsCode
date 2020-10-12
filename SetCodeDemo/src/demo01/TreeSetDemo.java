package demo01;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(10);
        ts.add(50);
        ts.add(20);
        ts.add(30);
        ts.add(30);
        System.out.println(ts); // [10, 20, 30, 50]
    }
}
