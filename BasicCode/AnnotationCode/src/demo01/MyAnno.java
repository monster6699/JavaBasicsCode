package demo01;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.ANNOTATION_TYPE)
/*本质是public interface MyAnno extends java.lang.annotation.Annotation {}*/
public @interface MyAnno {
    String eat();
    int play();
    String[] coment();
}
