package demo04;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class getMethodDemo {
    /*
    Class类中用于获取成员方法的方法
        Method[] getMethods​()：返回所有公共成员方法对象的数组，包括继承的
        Method[] getDeclaredMethods​()：返回所有成员方法对象的数组，不包括继承的
        Method getMethod​(String name, Class<?>... parameterTypes) ：返回单个公共成员方法对象
        Method getDeclaredMethod​(String name, Class<?>... parameterTypes)：返回单个成员方法对象

    Method类中用于调用成员方法的方法
        Object invoke​(Object obj, Object... args)：调用obj对象的成员方法，参数是args,返回值是Object类型

     */
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> aClass = Class.forName("demo04.Student");
        Constructor<?> constructor = aClass.getConstructor();
        Object o = constructor.newInstance();

        // Method getMethod​(String name, Class<?>... parameterTypes) ：返回单个公共成员方法对象
        Method method1 = aClass.getMethod("method1");
        method1.invoke(o);

        // Method[] getMethods​()：返回所有公共成员方法对象的数组，包括继承的
        Method[] methods = aClass.getMethods();
        for (Method method :
                methods) {
            System.out.println(method);
        }

        //Method getDeclaredMethod​(String name, Class<?>... parameterTypes)：返回单个成员方法对象
        Method method2 = aClass.getDeclaredMethod("method2");
        method2.setAccessible(true);
        method2.invoke(o);

        // Method[] getDeclaredMethods​()：返回所有成员方法对象的数组，不包括继承的
        Method[] declaredMethods = aClass.getDeclaredMethods();
        for (Method declaredMethod :
                declaredMethods) {
            System.out.println(declaredMethod);
        }

    }
}
