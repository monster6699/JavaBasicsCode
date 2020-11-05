package demo03;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    /*
    现在有两个ArrayList集合，分别存储6名男演员名称和6名女演员名称，要求完成如下的操作
        1.男演员只要名字为3个字的前三人
        2.女演员要以3结尾的，并且不要第一个
        3.把过滤后的男演员姓名和女演员姓名合并到一起
        4.把上一步操作后的元素作为构造方法的参数创建演员对象,遍历数据
        5.演员类Actor已经提供，里面有一个成员变量，一个带参构造方法，以及成员变量对应的get/set方法

    */
    public static void main(String[] args) {
        ArrayList<String> manList = new ArrayList<>();
        manList.add("男1");
        manList.add("男22");
        manList.add("男33");
        manList.add("男44");
        manList.add("男55");

        ArrayList<String> womanList = new ArrayList<>();
        womanList.add("女1");
        womanList.add("女123");
        womanList.add("女133");
        womanList.add("女12");

        Stream<String> manStream = manList.stream().filter(s -> s.length() == 3).limit(3);
        Stream<String> skipStream = womanList.stream().filter(s -> s.endsWith("3")).skip(1);
        Stream<String> stream = Stream.concat(manStream, skipStream);
        Stream<Actor> actorStream = stream.map(Actor::new);
        actorStream.forEach(s-> System.out.println(s.getName()));



    }
}
