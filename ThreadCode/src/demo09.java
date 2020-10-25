public class demo09 {
    public static void main(String[] args) {
        ThreadCls06 threadCls05 = new ThreadCls06();

        Thread t1 = new Thread(threadCls05, "窗口1");
        Thread t2 = new Thread(threadCls05, "窗口2");
        Thread t3 = new Thread(threadCls05, "窗口3");


        t1.start();
        t2.start();
        t3.start();
    }
}
