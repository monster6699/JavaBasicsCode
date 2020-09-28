package demo;

public class CatchClass {

    public static void main(String[] args) {
        System.out.println("开始");
        try {
            method();
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        System.out.println("结束");


    }

    public static void method() {
        int arr[] = {1, 2, 3};
        System.out.println( arr[3]);
    }
}
