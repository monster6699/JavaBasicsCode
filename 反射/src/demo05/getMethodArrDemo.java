package demo05;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class getMethodArrDemo {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        Class<? extends ArrayList> aClass = arrayList.getClass();
        Method method = aClass.getMethod("add", Object.class);
        method.invoke(arrayList, "one");
        method.invoke(arrayList, "two");
        method.invoke(arrayList, "three");
        System.out.println(arrayList);

    }
}
