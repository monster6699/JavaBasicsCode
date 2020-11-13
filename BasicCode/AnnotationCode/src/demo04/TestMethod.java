package demo04;

public class TestMethod {
    @Check
    public void add() {
        System.out.println(10 + 20);
    }

    @Check
    public void sub() {
        System.out.println(10 - 14);
    }

    @Check
    public void fl() {
        System.out.println(20 / 0);
    }

    public void show() {
        System.out.println("show------------------------");
    }
}
