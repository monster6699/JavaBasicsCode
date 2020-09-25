package StringBuilderDemo;

public class StringConstuct {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(stringBuilder);
        System.out.println("stringBuilder的长度为：" + stringBuilder.length());

        StringBuilder hello_java = new StringBuilder("hello java");
        System.out.println(hello_java);
        System.out.println("hello_java的长度为：" + hello_java.length());


        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = sb.append("hello");
        System.out.println(sb); // hello
        System.out.println(sb1); // hello
        System.out.println(sb==sb1); // true


        StringBuilder sb3 = new StringBuilder();
        sb3.append("hello").append(100).append("java");
        System.out.println(sb3); // hello100java
        // 反转方法
        sb3.reverse();
        System.out.println(sb3); // avaj001olleh

        // String抓换成Stringbuilder
        String str1 = "hello my world";
        StringBuilder sb4 = new StringBuilder(str1);
        System.out.println(sb4); //hello my world


        // String抓换成Stringbuilder转换成String
        StringBuilder sb5 = new StringBuilder("hello my good days");
        String s = sb5.toString();
        System.out.println(s); // hello my good days

        //字符串拼接demo
        int arr[] = {1, 4, 5, 20, 13, 32};
        String s1 = arrToSting(arr);
        System.out.println(s1); // [1, 4, 5, 20, 13, 32]

        String str2 = "long long ago";
        String s2 = strReverse(str2);
        System.out.println(s2); // oga gnol gnol


    }


    public static String arrToSting (int arr[]) {
        StringBuilder sb6 = new StringBuilder();
        sb6.append("[");
        for (int i = 0; i < arr.length ; i++) {
            if (i == arr.length-1){
                sb6.append(arr[i]);
            } else {
                sb6.append(arr[i]).append(", ");
            }

        }
        sb6.append("]");
        String s1 = sb6.toString();
        return s1;

    }

    public static String strReverse(String str) {
        String s = new StringBuilder(str).reverse().toString();
        return  s;
    }
}
