package mathDemo;

import java.util.Arrays;

public class demo {
    public static void main(String[] args) {
        int abs = Math.abs(-24);
        System.out.println(abs); //24
        double ceil = Math.ceil(2.4);
        System.out.println(ceil); //3.0
        double floor = Math.floor(2.3);
        System.out.println(floor); // 2.0
        long round = Math.round(2.6);
        System.out.println(round); //3 四舍五入
        int max = Math.max(20, 40);
        System.out.println(max); // 40
        int min = Math.min(20, 40);
        System.out.println(min); //20
        double pow = Math.pow(2, 3);
        System.out.println(pow); //8.0 返回2的3次幂的值
        // System.exit(0);
        double random = Math.random();
        System.out.println(random); // 返回值为double的正值，[0.0,1.0)

        long l = System.currentTimeMillis();
        System.out.println(l);
        System.out.println(l/1000/60/60/24/365);
        System.out.println("+++++++++++++++++++++++++++++++");
        int a[] = {2, 10, 3, 49, 6, 5};
        String s = Arrays.toString(a);
        System.out.println(s); //[2, 10, 3, 49, 6, 5]
        Arrays.sort(a);
        String ss = Arrays.toString(a);
        System.out.println(ss); // [2, 3, 5, 6, 10, 49]

        int num = 10;
        String s1 = String.valueOf(num); //class java.lang.String
        System.out.println(s1); // 10
        System.out.println(s1.getClass()); // 10
        String str1 = "123";
        Integer integer = Integer.valueOf(str1);
        System.out.println(integer.getClass()); //class java.lang.Integer
        int i = Integer.parseInt(str1);
        System.out.println(i); // 123
    }
}
