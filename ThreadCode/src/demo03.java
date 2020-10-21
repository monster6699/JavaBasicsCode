public class demo03 {
    public static void main(String[] args) {
        ThreadCls02 threadCls01 = new ThreadCls02("信阳");
        ThreadCls02 threadCls02 = new ThreadCls02("北京");
        ThreadCls02 threadCls03 = new ThreadCls02("上海");
//
//        System.out.println(threadCls01.getPriority()); // 获取优先级5
//        System.out.println(threadCls02.getPriority()); // 获取优先级5
//        System.out.println(threadCls03.getPriority()); // 获取优先级5
        threadCls01.setPriority(10); // 设置优先级
        threadCls02.setPriority(1);
        threadCls03.setPriority(5);

        threadCls01.start();
        threadCls02.start();
        threadCls03.start();

    }
}
