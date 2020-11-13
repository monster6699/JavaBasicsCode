public class demo06 {
    public static void main(String[] args) {
        ThreadCls03 threadCls01 = new ThreadCls03();
        ThreadCls03 threadCls02 = new ThreadCls03();

        threadCls01.setName("张飞");
        threadCls02.setName("关羽");

        Thread.currentThread().setName("刘备");

        threadCls01.setDaemon(true); //刘备结束后自己也结束
        threadCls02.setDaemon(true); //刘备结束后自己也结束

        threadCls01.start();
        threadCls02.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}
