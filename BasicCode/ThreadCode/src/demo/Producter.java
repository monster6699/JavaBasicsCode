package demo;

public class Producter implements Runnable {
    private Box b;

    public Producter(Box box) {
        this.b = box;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            b.put(i);
        }
    }
}
