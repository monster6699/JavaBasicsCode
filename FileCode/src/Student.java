public class Student {
    private String nid;
    private String name;
    private int age;
    private String address;

    public Student(String nid, String name, int age, String address) {
        this.nid = nid;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Student() {
    }

    public String getNid() {
        return nid;
    }

    public void setNid(String nid) {
        this.nid = nid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
