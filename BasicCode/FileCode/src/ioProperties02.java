import java.util.Properties;
import java.util.Set;

public class ioProperties02 {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("monster001", "fastYarn");
        properties.setProperty("monster002", "fastHa");
        properties.setProperty("monster003", "fastMa");
        /*
        底层使用的也是put
        public synchronized Object setProperty(String key, String value) {
            return put(key, value);
        }

        public synchronized Object put(Object key, Object value) {
            return map.put(key, value);
        }
         */

        Object monster001 = properties.get("monster001");
        System.out.println(monster001);

        Set<String> strings = properties.stringPropertyNames();
        for (String key :
                strings) {
            String value = properties.getProperty(key);
            System.out.println(key + "," + value);
        }
    }
}
