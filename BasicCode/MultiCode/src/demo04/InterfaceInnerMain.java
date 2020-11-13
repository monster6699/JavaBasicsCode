package demo04;

public class InterfaceInnerMain {
    public static void main(String[] args) {
        new InterfaceInner() {
            @Override
            public void eat() {
                System.out.println("eat .......");
            }
        }.eat();
    }
}
