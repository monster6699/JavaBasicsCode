package demo02;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface AnnoCls {
    int show(); //int
    String show1(); // String
    Common commn(); // 枚举
    String[] strs();
    String deStr() default "hele";

}
