package demo04;

public class MyOuter {

    public void innerMethod() {
        int num = 10;
        num = 20;
        class inenerClass {
            public void method() {
//                System.out.println(num); // 报错
            }
        }
    }
}
