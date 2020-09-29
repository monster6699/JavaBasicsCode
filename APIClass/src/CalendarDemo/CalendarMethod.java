package CalendarDemo;

import java.util.Calendar;

public class CalendarMethod {
    public static void main(String[] args) {

        Calendar instance = Calendar.getInstance();
        int year = instance.get(Calendar.YEAR);
        int month = instance.get(Calendar.MONTH) + 1;
        int date = instance.get(Calendar.DATE);
        System.out.println(year + "-" + month + "-" + date);
        instance.add(Calendar.YEAR, -1);
        instance.add(Calendar.MONTH, -2);
        int year1 = instance.get(Calendar.YEAR);
        int month1 = instance.get(Calendar.MONTH) + 1;
        int date1 = instance.get(Calendar.DATE);
        System.out.println(year1 + "-" + month1 + "-" + date1);

        instance.set(2020,11,11);
        int year3 = instance.get(Calendar.YEAR);
        int month3 = instance.get(Calendar.MONTH) + 1;
        int date3 = instance.get(Calendar.DATE);
        System.out.println(year3 + "-" + month3 + "-" + date3);



    }
}
