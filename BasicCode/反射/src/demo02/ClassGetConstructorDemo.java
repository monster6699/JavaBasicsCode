package demo02;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassGetConstructorDemo {
    /*
    Class类中用于获取构造方法的方法
        Constructor<?>[] getConstructors​()：返回所有公共构造方法对象的数组
        Constructor<?>[] getDeclaredConstructors​()：返回所有构造方法对象的数组
        Constructor<T> getConstructor​(Class<?>... parameterTypes)：返回单个公共构造方法对象
        Constructor<T> getDeclaredConstructor​(Class<?>... parameterTypes)：返回单个构造方法对象

    Constructor类中用于创建对象的方法
        T newInstance​(Object... initargs)：根据指定的构造方法创建对象
     */
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Class<?> aClass = Class.forName("demo02.Student");

        // Constructor<?>[] getConstructors​()：返回所有公共构造方法对象的数组
        Constructor<?>[] constructors = aClass.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }

        System.out.println("---------------------------------");

        // Constructor<T> getConstructor​(Class<?>... parameterTypes)：返回单个公共构造方法对象
        Constructor<?> constructor = aClass.getConstructor();
        System.out.println(constructor);

        System.out.println("---------------------------------");

        // Constructor<?>[] getDeclaredConstructors​()：返回所有构造方法对象的数组
        Constructor<?>[] declaredConstructors = aClass.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }

        System.out.println("---------------------------------");

        // Constructor<T> getDeclaredConstructor​(Class<?>... parameterTypes)：返回单个构造方法对象
        Constructor<?> declaredConstructor1 = aClass.getDeclaredConstructor();
        System.out.println(declaredConstructor1);

        Object o = declaredConstructor1.newInstance();
        System.out.println(o);


    }
}
