package demo04;

public class DemoInnerClass {
    int num = 10;
    public class DemoOuterClass {
        int num = 20;
        public void innerMethod() {
            int num = 30;
            System.out.println(num);
            System.out.println(this.num);
            System.out.println(DemoInnerClass.this.num);
        }
    }
    public void demoMethod() {

    }
}

