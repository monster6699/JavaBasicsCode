package demo2;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> listData = new ArrayList<>();
        listData.add("爱奇艺");
        listData.add("优酷");
        listData.add("腾讯");
        listData.add("韩剧TV");
//        listData.add(1, "apple TV");
//        listData.add(11, "apple TV"); //IndexOutOfBoundsException


//        String de = listData.set(1, "乐视");
//        String de = listData.set(111, "乐视"); //IndexOutOfBoundsException
//        System.out.println(de);

//        String remove = listData.remove(3);
//        String remove = listData.remove(11); //IndexOutOfBoundsException
//        System.out.println(remove);

//        String s = listData.get(1); //优酷
//        String s = listData.get(11); // IndexOutOfBoundsException
//        System.out.println(s);
        for (int i = 0; i< listData.size(); i++) {
            System.out.println(listData.get(i));

        }
        System.out.println(listData);
    }
}
