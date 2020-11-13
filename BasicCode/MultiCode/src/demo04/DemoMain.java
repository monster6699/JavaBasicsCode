package demo04;

public class DemoMain {
    public static void main(String[] args) {
        DemoInnerClass.DemoOuterClass demoOuterClass = new DemoInnerClass().new DemoOuterClass();
        demoOuterClass.innerMethod();
    }


}
