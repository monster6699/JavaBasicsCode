public class demo11 {
    public static void main(String[] args) {
        ThreadCls07 threadCls07 = new ThreadCls07();

        Thread t1 = new Thread(threadCls07, "窗口1");
        Thread t2 = new Thread(threadCls07, "窗口2");
        Thread t3 = new Thread(threadCls07, "窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
