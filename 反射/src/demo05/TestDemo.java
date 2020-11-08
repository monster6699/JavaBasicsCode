package demo05;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class TestDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Properties properties = new Properties();
        FileReader fileReader = new FileReader("反射/prop.txt");
        properties.load(fileReader);
        fileReader.close();

        Class<?> aClass= Class.forName(properties.getProperty("ClassName"));
        Constructor<?> constructor = aClass.getConstructor();
        Object o = constructor.newInstance();

        Method method = aClass.getMethod(properties.getProperty("Method"));
        method.invoke(o);

    }
}
