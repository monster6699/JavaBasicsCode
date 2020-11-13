public class demo04 {
    public static void main(String[] args) {
        ThreadCls02 threadCls01 = new ThreadCls02("刘备");
        ThreadCls02 threadCls02 = new ThreadCls02("曹操");
        ThreadCls02 threadCls03 = new ThreadCls02("孙权");

        threadCls01.start();
        threadCls02.start();
        threadCls03.start();

    }
}
