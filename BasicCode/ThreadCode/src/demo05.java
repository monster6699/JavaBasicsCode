public class demo05 {
    public static void main(String[] args) {
        ThreadCls03 threadCls01 = new ThreadCls03();
        ThreadCls03 threadCls02 = new ThreadCls03();
        ThreadCls03 threadCls03 = new ThreadCls03();
        threadCls01.setName("皇上");
        threadCls02.setName("太子1");
        threadCls03.setName("太子2");

        threadCls01.start();
        try {
            threadCls01.join(); // 等待01运行完才会运行太子
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        threadCls02.start();
        threadCls03.start();
    }
}
