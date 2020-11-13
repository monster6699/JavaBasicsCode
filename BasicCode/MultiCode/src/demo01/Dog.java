package demo01;

public class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("狗吃屎");
    }

    public void wang() {
        System.out.println("dog");
    }
}
