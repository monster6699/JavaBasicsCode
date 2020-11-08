package demo03;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class getFieldDemo01 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class<?> aClass = Class.forName("demo03.Student");
        Constructor<?> constructor = aClass.getConstructor();
        Object o = constructor.newInstance();

        Field name = aClass.getDeclaredField("name");
        name.setAccessible(true);
        Field address = aClass.getDeclaredField("address");
        address.setAccessible(true);
        Field age = aClass.getDeclaredField("age");
        age.setAccessible(true);

        name.set(o, "monster");
        age.set(o, 20);
        address.set(o, "BeiJing");

        System.out.println(o);
    }
}
