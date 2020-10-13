import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class demo2 {
    public static void main(String[] args) {
        HashMap<String, String> stringStringHashMap = new HashMap<>();
        stringStringHashMap.put("one", "1111");
        stringStringHashMap.put("two", "2222");
        stringStringHashMap.put("three", "3333");
        stringStringHashMap.put("four", "4444");
//        System.out.println(stringStringHashMap.remove("one"));
//        System.out.println(stringStringHashMap.get("one"));
//        System.out.println(stringStringHashMap.containsKey("two"));
//        System.out.println(stringStringHashMap.containsValue("1111"));
//        stringStringHashMap.clear();
//        System.out.println(stringStringHashMap.size());
//        System.out.println(stringStringHashMap.isEmpty());
        System.out.println(stringStringHashMap);

        Set<String> strings = stringStringHashMap.keySet();
        System.out.println(strings); //[four, one, two, three]

        Collection<String> values = stringStringHashMap.values();
        System.out.println(values); // [4444, 1111, 2222, 3333]

        // 方式1遍历
        for (String str :
                stringStringHashMap.keySet()) {
            System.out.println(str + "," + stringStringHashMap.get(str));
        }
        
        // 方式2遍历
        Set<Map.Entry<String, String>> entries = stringStringHashMap.entrySet();
        for (Map.Entry<String, String> me :
                entries) {
            System.out.println(me.getKey() + "," + me.getValue());
        }


    }
}
