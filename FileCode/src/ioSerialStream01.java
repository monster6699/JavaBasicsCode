import java.io.*;

public class ioSerialStream01 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("FileCode/oss.txt"));
        Student student = new Student("001", "思路", 24, "Beijing");
        objectOutputStream.writeObject(student); // NotSerializableException: Student 需要实现implements Serializable
        objectOutputStream.close();


        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("FileCode/oss.txt"));
        Object o = objectInputStream.readObject();
        Student student1 = (Student) o;
        System.out.println(student1.getName() + "," + student1.getNid() + "," + student1.getAge() + "," + student1.getAddress());
    }
}
