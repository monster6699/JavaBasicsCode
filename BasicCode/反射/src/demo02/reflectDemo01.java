package demo02;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class reflectDemo01 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> aClass = Class.forName("demo02.Student");
        Constructor<?> constructor = aClass.getConstructor(String.class, int.class);
        System.out.println(constructor);
        Object o = constructor.newInstance("小明", 30);
        System.out.println(o); //Student{name='小明', age=30}


        Constructor<?> declaredConstructor = aClass.getDeclaredConstructor(String.class);
        // 因为获取的是私有方法所以使用暴力破解才能使用
        declaredConstructor.setAccessible(true);
        Object o1 = declaredConstructor.newInstance("小小明");
        System.out.println(o1); // Student{name='小小明', age=0}


    }
}
