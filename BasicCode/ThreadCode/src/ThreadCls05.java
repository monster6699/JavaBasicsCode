public class ThreadCls05 implements Runnable {
    private int tickets = 100;
    Object object = new Object();
    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                if (tickets > 0) {
                    System.out.println(Thread.currentThread().getName() + "正在出售" + tickets + "张票");
                    tickets--;
                }
            }
        }
    }
}
