package demo02;

public class RunnableDemo {
    public static void main(String[] args) {
        // 匿名内部类
        startRunnable(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "线程");
            }
        });

        // 函数式接口
        startRunnable(() -> System.out.println(Thread.currentThread().getName() + "线程"));
    }

    public static void startRunnable(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
