import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class demo04 {
    public static void main(String[] args) {
        ArrayList<HashMap<String, String>> hashMaps = new ArrayList<>();

        HashMap<String, String> stringStringHashMap1 = new HashMap<>();
        stringStringHashMap1.put("name", "one");
        stringStringHashMap1.put("address", "BeiJing");

        HashMap<String, String> stringStringHashMap2 = new HashMap<>();
        stringStringHashMap2.put("name", "two");
        stringStringHashMap2.put("address", "ShangHai");

        HashMap<String, String> stringStringHashMap3 = new HashMap<>();
        stringStringHashMap3.put("name", "three");
        stringStringHashMap3.put("address", "Shengzheng");

        hashMaps.add(stringStringHashMap1);
        hashMaps.add(stringStringHashMap2);
        hashMaps.add(stringStringHashMap3);

        for (HashMap<String, String> hm :
                hashMaps) {
            Set<Map.Entry<String, String>> entries = hm.entrySet();
            for (Map.Entry<String, String> me: entries
                 ) {
                System.out.println(me.getKey() + "," + me.getValue());
            }
        }

    }
}
