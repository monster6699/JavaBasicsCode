package demo04;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class getMethodDemo01 {
    /*
    练习：通过反射实现如下操作
        Student s = new Student();
        s.method3("monster");
        String ss = s.method3("monster",20);
        System.out.println(ss);
        s.function();
     */
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> aClass = Class.forName("demo04.Student");
        Constructor<?> constructor = aClass.getConstructor();
        Object o = constructor.newInstance();

        Method method3 = aClass.getDeclaredMethod("method3", String.class);
        method3.invoke(o, "monster");

        Method method4 = aClass.getDeclaredMethod("method4", String.class, int.class);
        Object res = method4.invoke(o, "monster", 20);
        System.out.println(res);
    }
}
