package demo02;

public class Eable {
    public static void main(String[] args) {

        userAble(new EableInf() {
            @Override
            public void sleep(String s) {
                System.out.println(s);
            }
        });

        userAble((String s) -> {
            System.out.println(s);
        });

        userAble((String s) -> System.out.println(s));

        userAble((s) -> System.out.println(s));

        userAble(s -> System.out.println(s));


    }


    public static void userAble(EableInf able) {
        able.sleep("爱睡觉");
    }
}
