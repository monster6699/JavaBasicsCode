package demo02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.stream.Stream;

public class StreamGernerFunc {
    public static void main(String[] args) {

        //collection
        ArrayList<String> strings = new ArrayList<>();
        Stream<String> stream = strings.stream();

        HashSet<String> strings1 = new HashSet<>();
        Stream<String> stream1 = strings1.stream();


        //Map
        HashMap<String, Integer> stringIntegerHashMap = new HashMap<>();
        Stream<String> stream2 = stringIntegerHashMap.keySet().stream(); //键流
        Stream<Integer> stream3 = stringIntegerHashMap.values().stream(); //值流
        Stream<Map.Entry<String, Integer>> stream4 = stringIntegerHashMap.entrySet().stream(); //entry流

        //list
        String[] arr = {"one", "two", "three"};
        Stream<String> arr1 = Stream.of(arr);
        Stream<String> one = Stream.of("one", "three", "four");
        Stream<Integer> integerStream = Stream.of(11, 22, 33);
        integerStream.forEach(System.out::println);


    }

}
