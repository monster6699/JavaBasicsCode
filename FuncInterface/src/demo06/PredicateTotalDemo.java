package demo06;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateTotalDemo {
    public static void main(String[] args) {
        String[] arr = {"aa,35", "bb,40", "ccc,66", "monster,100"};
        ArrayList<String> strings = dataFilter(arr, s -> s.split(",")[0].length() >= 3, s -> Integer.parseInt(s.split(",")[1]) > 30);
        System.out.println(strings);
    }

    private static ArrayList<String> dataFilter(String[] arr, Predicate<String> pre1, Predicate<String> pre2) {
        ArrayList<String> strings = new ArrayList<>();
        for (String item:
             arr) {
            boolean b = pre1.and(pre2).test(item);
            if(b){
                strings.add(item);
            }
        }

        return strings;

    }
}
