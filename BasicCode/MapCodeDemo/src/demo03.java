import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class demo03 {
    public static void main(String[] args) {
        HashMap<String, Student> stringStudentHashMap = new HashMap<>();
        stringStudentHashMap.put("001", new Student("张三", 20));
        stringStudentHashMap.put("002", new Student("李四", 21));
        stringStudentHashMap.put("003", new Student("王二", 22));
        stringStudentHashMap.put("004", new Student("麻子", 23));

        // 方式1
        for (String key : stringStudentHashMap.keySet()) {
            System.out.println("key: " + key + " name:" + stringStudentHashMap.get(key).getName() + " age: " + stringStudentHashMap.get(key).getAge());
        }

        System.out.println("-------------------------------------------");

        // 方式2
        Set<Map.Entry<String, Student>> entries = stringStudentHashMap.entrySet();
        for (Map.Entry<String, Student> me : entries) {
            String key = me.getKey();
            Student stu = me.getValue();
            System.out.println("key: " + key + " name:" + stu.getName() + " age: " + stu.getAge());
        }

        System.out.println("-------------------------------------------");

        HashMap<Student, String> studentStringHashMap = new HashMap<>();
        studentStringHashMap.put(new Student("one", 21), "001");
        studentStringHashMap.put(new Student("two", 22), "002");
        studentStringHashMap.put(new Student("three", 23), "003");
        studentStringHashMap.put(new Student("three", 23), "003");

        Set<Map.Entry<Student, String>> entries1 = studentStringHashMap.entrySet();
        for (Map.Entry<Student, String> me :
                entries1) {
            Student student = me.getKey();
            String values = me.getValue();
            System.out.println(student.getName() + "," + student.getAge() + "," + values);
        }


    }
}
