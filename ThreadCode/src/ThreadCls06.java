public class ThreadCls06 implements Runnable {
    private static int tickets = 100;
    Object object = new Object();
    private int i = 0;

    @Override
    public void run() {
        while (true) {
            if (i % 2 == 0) {
                synchronized (ThreadCls06.class) {
                    if (tickets > 0) {
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(Thread.currentThread().getName() + "正在出售" + tickets + "张票");
                        tickets--;
                    }
                }
            } else {
                sellTicket();
            }
            i++;
        }
    }

    private static synchronized void sellTicket() {
        if (tickets > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "正在出售" + tickets + "张票");
            tickets--;
        }
    }
}
