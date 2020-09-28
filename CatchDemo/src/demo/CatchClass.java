package demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CatchClass {

    public static void main(String[] args) {
        System.out.println("开始");
        try {
            method();
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        try {
            formateDate();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("结束");


    }
    public static void  formateDate () throws ParseException {
        String strDate = "2020-10-01";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = simpleDateFormat.parse(strDate);
        System.out.println(parse);
    }

    public static void method() {
        int arr[] = {1, 2, 3};
        System.out.println( arr[3]);
    }
}
