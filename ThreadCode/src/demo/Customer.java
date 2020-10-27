package demo;

public class Customer implements Runnable {
    private Box b;
    public Customer(Box box) {
        this.b = box;
    }

    @Override
    public void run() {
        while (true) {
            b.get();
        }

    }
}
