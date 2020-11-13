import java.io.*;

public class ioSerialStream02 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        write();
        read();
    }

    private static void write() throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("FileCode/oss1.txt"));
        Student student = new Student("001", "思路", 24, "Beijing");
        objectOutputStream.writeObject(student); // NotSerializableException: Student 需要实现implements Serializable
        objectOutputStream.close();
    }

    private static void read() throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("FileCode/oss1.txt"));
        Object o = objectInputStream.readObject();
        Student student1 = (Student) o;
        System.out.println(student1.getName() + "," + student1.getNid() + "," + student1.getAge() + "," + student1.getAddress());
    }


}
