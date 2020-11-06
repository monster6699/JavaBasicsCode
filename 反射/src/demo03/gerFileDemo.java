package demo03;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class gerFileDemo {
    /*
    Class类中用于获取成员变量的方法
        Field[] getFields​()：返回所有公共成员变量对象的数组
        Field[] getDeclaredFields​()：返回所有成员变量对象的数组
        Field getField​(String name)：返回单个公共成员变量对象
        Field getDeclaredField​(String name)：返回单个成员变量对象

    Field类中用于给成员变量赋值的方法
        void set​(Object obj, Object value)：给obj对象的成员变量赋值为value
     */
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> aClass = Class.forName("demo03.Student");

        Field[] fields = aClass.getFields();
        for (Field field :
                fields) {
            System.out.println(field);
        }

        System.out.println("-------------------------------");
        Field address = aClass.getDeclaredField("address");
        // 私有变量暴力破解使用
        address.setAccessible(true);
        System.out.println(address);
        System.out.println("------------------------------");

        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field field :
                declaredFields) {
            System.out.println(field);
        }

        System.out.println("--------------------------------");

        Field fild = aClass.getField("address");
        Constructor<?> constructor = aClass.getConstructor();
        Object o = constructor.newInstance();
        fild.set(o, "北京");
        System.out.println(o);

    }
}
