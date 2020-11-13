package demo01;

import java.util.ArrayList;
import java.util.Collection;

public class ListForEachDemo {
    public static void main(String[] args) {
        // 数组
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        for (int i : arr) {
            System.out.println(i);
        }
        // 集合collection
        Collection<String> listStr = new ArrayList<>();
        listStr.add("a");
        listStr.add("b");
        listStr.add("c");

        for (String i : listStr) {
            System.out.println(i);
        }
    }
}
