package demo03;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@ProConfig(ClassName = "demo03.Teach", MethodName = "work")
public class MyAnnoReflect {
    public static void main(String[] args) throws NoSuchMethodException, ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<MyAnnoReflect> myAnnoReflectClass = MyAnnoReflect.class;
        ProConfig annotation = myAnnoReflectClass.getAnnotation(ProConfig.class);

        String className = annotation.ClassName();
        String methodName = annotation.MethodName();

        Class<?> aClass= Class.forName(className);
        Constructor<?> constructor = aClass.getConstructor();
        Object o = constructor.newInstance();

        Method method = aClass.getMethod(methodName);
        method.invoke(o);

    }
}
