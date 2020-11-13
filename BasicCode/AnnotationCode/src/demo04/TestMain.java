package demo04;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestMain {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, IOException, NoSuchMethodException, InstantiationException {
        Class<TestMethod> testMethodClass = TestMethod.class;
        Constructor<TestMethod> constructor = testMethodClass.getConstructor();
        TestMethod testMethod = constructor.newInstance();
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("./bug.txt"));
        Method[] methods = testMethodClass.getMethods();
        int num = 0;
        for (Method method : methods) {
            if(method.isAnnotationPresent(Check.class)) {
//                method.invoke(testMethod);
                try {
                    method.invoke(testMethod);
                } catch (Exception e) {
                    num++;
                    bufferedWriter.write(method.getName() + "出现异常");
                    bufferedWriter.newLine();
                    bufferedWriter.write("异常名称" + e.getCause().getClass().getSimpleName());
                    bufferedWriter.newLine();
                    bufferedWriter.write("异常原因： " + e.getCause().getMessage());
                    bufferedWriter.newLine();
                }
            }
        }

        bufferedWriter.write("出现次数： " + num);
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
