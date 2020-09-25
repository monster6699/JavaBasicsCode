package mathDemo;

import java.time.Instant;
import java.util.Date;

public class demo2 {


    public static void main(String[] args) {
        Date date = new Date();
        Instant instant = date.toInstant();
        System.out.println(instant);
        System.out.println(date);
        Date date1 = new Date(1600192800000L);
        System.out.println(date1);


    }

}
