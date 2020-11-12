package demo01;

public class ClassLoadDemo {
    public static void main(String[] args) {
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader); // jdk.internal.loader.ClassLoaders$AppClassLoader@3d4eac69

        ClassLoader parent = systemClassLoader.getParent();
        System.out.println(parent); // jdk.internal.loader.ClassLoaders$PlatformClassLoader@41629346

        ClassLoader parent1 = parent.getParent();
        System.out.println(parent1); // null
    }
}
