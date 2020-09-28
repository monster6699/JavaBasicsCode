package demo1;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionArrayList {
    public static void main(String[] args) {
        Collection<String> collList = new ArrayList<>();
        collList.add("aa");
        collList.add("bb");
        collList.add("cc");
        collList.add("dd");
        System.out.println(collList.remove("dd")); // true
        System.out.println(collList.remove("ll")); // false
//        collList.clear(); // []
        System.out.println(collList.contains("aa")); // true
        System.out.println(collList.contains("ghh")); // false

        boolean empty = collList.isEmpty();
        System.out.println(empty);

        int size = collList.size();
        System.out.println(size);
        System.out.println(collList);
    }
}
