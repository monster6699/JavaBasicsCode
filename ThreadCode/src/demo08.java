public class demo08 {
    public static void main(String[] args) {
        ThreadCls05 threadCls05 = new ThreadCls05();

        Thread t1 = new Thread(threadCls05, "窗口1");
        Thread t2 = new Thread(threadCls05, "窗口2");
        Thread t3 = new Thread(threadCls05, "窗口3");


        t1.start();
        t2.start();
        t3.start();
    }
}
