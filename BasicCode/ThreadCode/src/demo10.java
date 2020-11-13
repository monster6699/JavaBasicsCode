import java.util.*;

public class demo10 {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer(); //线程安全、
        StringBuilder stringBuilder = new StringBuilder(); //线程不安全

        Vector<String> strings = new Vector<>();// 线程安全
        ArrayList<String> strings1 = new ArrayList<>();//线程不安全

        Hashtable<String, String> stringStringHashtable = new Hashtable<>(); //线程安全
        HashMap<String, String> stringStringHashMap = new HashMap<>(); //线程不安全

        List<String> strings2 = Collections.synchronizedList(strings1); // 线程安全
        Map<String, String> stringStringMap = Collections.synchronizedMap(stringStringHashMap); // 线程安全
    }
}
