package demo06;

public interface MyInterface {
    void eat();

    default void sleep() {
        System.out.println("睡觉");
    }

    static void play() {
        System.out.println("玩");
    }
}
