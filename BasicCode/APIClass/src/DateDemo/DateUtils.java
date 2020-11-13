package DateDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

    private DateUtils() {
    }

    public static String dateToString(Date date, String formate){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(formate);
        String format = simpleDateFormat.format(date);
        return format;
    }

    public static Date stringToDate(String s, String formate) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(formate);
        Date parse = simpleDateFormat.parse(s);
        return parse;
    }
}
