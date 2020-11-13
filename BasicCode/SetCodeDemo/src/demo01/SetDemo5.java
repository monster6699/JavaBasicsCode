package demo01;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo5 {
    public static void main(String[] args) {
        Random random = new Random();
//        Set<Integer> set = new HashSet<Integer>();
        TreeSet<Integer> set = new TreeSet<>();
       while (set.size() < 10) {
           int num  = random.nextInt(20) + 1;
           set.add(num);
       }
        System.out.println(set); //[4, 5, 10, 11, 12, 13, 15, 16, 19, 20]
    }
}
