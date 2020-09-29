package DateDemo;

import java.text.ParseException;
import java.util.Date;

public class DemoMain {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        String s = DateUtils.dateToString(date, "yyyy年MM月dd日 HH:mm:ss"); //2020年09月24日 22:40:35
        String s1 = DateUtils.dateToString(date, "yyyy-MM-dd HH:mm:ss"); //2020-09-24 22:40:35
        String s2 = DateUtils.dateToString(date, "HH:mm:ss"); //22:40:35
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);

        String s3 = "2020-09-24 22:37:05";
        Date date1 = DateUtils.stringToDate(s3, "y yy-MM-dd"); //2020-09-24 22:37:05
        System.out.println(s3);
    }
}
