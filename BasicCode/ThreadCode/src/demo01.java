public class demo01 {
    public static void main(String[] args) {
        ThreadCls01 threadCls01 = new ThreadCls01();
        ThreadCls01 threadCls02 = new ThreadCls01();

//        threadCls01.run();
//        threadCls02.run(); // 调用run方法时为普通的线程，并不是多线程

        threadCls01.start();
        threadCls02.start(); // 使用start方法调用多线程



    }
}
