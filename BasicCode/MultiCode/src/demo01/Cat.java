package demo01;

public class Cat implements Animal {

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void sleep() {
        System.out.println("cat");
    }
}
