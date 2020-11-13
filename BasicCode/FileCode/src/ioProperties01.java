import java.util.Properties;
import java.util.Set;

public class ioProperties01 {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.put("sid001", "武松");
        properties.put("sid002", "武大郎");
        properties.put("sid003", "潘金莲");
        Set<Object> objects = properties.keySet();

        for (Object set: objects){
            Object o = properties.get(set);
            System.out.println(set + "," + o);
        }

    }
}
