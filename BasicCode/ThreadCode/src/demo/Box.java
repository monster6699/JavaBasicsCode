package demo;

public class Box {
    private int num;
    private boolean flag;
    public synchronized void put(int num) {
        if(flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.num = num;
        System.out.println("放入牛奶： " + this.num);
        this.flag = true;
        notifyAll();
    }

    public synchronized void get() {
        if(!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("消费牛奶： " + num);
        this.flag = false;
        notifyAll();
    }
}
