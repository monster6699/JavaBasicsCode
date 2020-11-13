package demo03;

public class Eable {
    public static void main(String[] args) {

        userAble(new EableInf() {
            @Override
            public int add(int x, int y) {
                return x + y;
            }
        });

        userAble((int x, int y) -> {
            return x + y;
        });

        userAble((x, y) -> x + y);


    }

    public static void userAble(EableInf able) {
        int sum = able.add(10, 10);
        System.out.println(sum);
    }
}
