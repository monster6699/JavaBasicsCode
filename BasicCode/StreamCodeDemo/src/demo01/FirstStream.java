package demo01;

import java.util.ArrayList;

public class FirstStream {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("张三");
        strings.add("李四");
        strings.add("张无忌");
        strings.add("张先锋");


        for (String item:
             strings) {
            if(item.startsWith("张") && item.length() >=3) {
                System.out.println(item);
            }
        }
        System.out.println("-------");
        // stream流实现
        strings.stream().filter(s-> s.startsWith("张")).filter(s->s.length()>=3).forEach(System.out::println);
    }
}
