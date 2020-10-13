import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class demo05 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> stringArrayListHashMap = new HashMap<>();

        ArrayList<String> beiJing = new ArrayList<>();
        beiJing.add("朝阳区");
        beiJing.add("海淀区");
        beiJing.add("丰台区");
        stringArrayListHashMap.put("北京市", beiJing);

        ArrayList<String> shangHai = new ArrayList<>();
        shangHai.add("奉贤区");
        shangHai.add("浦东区");
        shangHai.add("晋安区");
        stringArrayListHashMap.put("上海市", shangHai);


        Set<String> strings = stringArrayListHashMap.keySet();
        System.out.println("{");
        for (String key :
                strings) {
            ArrayList<String> strings1 = stringArrayListHashMap.get(key);
            System.out.println(key + ":" + strings1);
        }
        System.out.println("}");
    }
}
