public class demo07 {
    public static void main(String[] args) {
        ThreadCls04 threadCls04 = new ThreadCls04();

        Thread thread1 = new Thread(threadCls04, "信阳");
        Thread thread2 = new Thread(threadCls04, "北京");


        thread1.start();
        thread2.start();
    }
}
