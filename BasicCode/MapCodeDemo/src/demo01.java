import java.util.HashMap;
import java.util.Map;
import java.util.SplittableRandom;

public class demo01 {
    public static void main(String[] args) {
        Map<String, String> stringHashMap = new HashMap<String, String>();
        stringHashMap.put("one", "11");
        stringHashMap.put("two", "22");
        stringHashMap.put("three", "33");
        System.out.println(stringHashMap);
    }
}
