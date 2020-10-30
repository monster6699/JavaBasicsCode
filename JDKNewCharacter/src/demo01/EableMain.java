package demo01;

public class EableMain {
    public static void main(String[] args) {
        EableInf eableInf = new EableIml();
        useEable(eableInf);

        useEable(new EableInf() {
            @Override
            public void eat() {
                System.out.println("吃苹果");
            }
        });

        useEable(() -> {
            System.out.println("吃橘子");
        });

        useEable(() -> System.out.println("吃橘子------"));


    }

    public static void useEable(EableInf able) {
        able.eat();
    }
}
