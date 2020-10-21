public class demo02 {
    public static void main(String[] args) {
//        ThreadClsName02 threadClsName01 = new ThreadClsName02();
//        ThreadClsName02 threadClsName02 = new ThreadClsName02();

//        threadClsName01.setName("信阳");
//        threadClsName02.setName("北京");


        ThreadCls02 threadClsName01 = new ThreadCls02("信阳");
        ThreadCls02 threadClsName02 = new ThreadCls02("北京");
        System.out.println(Thread.currentThread().getName());
        threadClsName01.start();
        threadClsName02.start();



        /*
        private volatile String name;

        public Thread() {
            this(null, null, "Thread-" + nextThreadNum(), 0);
        }

        public final String getName() {
            return name;
        }

        public Thread(ThreadGroup group, Runnable target, String name,
                  long stackSize) {
            this(group, target, name, stackSize, null, true);
        }


        private Thread(ThreadGroup g, Runnable target, String name,
                   long stackSize, AccessControlContext acc,
                   boolean inheritThreadLocals) {
            if (name == null) {
                throw new NullPointerException("name cannot be null");
             }
            this.name = name;
        }

        public final synchronized void setName(String name) {
            checkAccess();
            if (name == null) {
                throw new NullPointerException("name cannot be null");
            }

            this.name = name;
            if (threadStatus != 0) {
                setNativeName(name);
            }
        }


        private static int threadInitNumber;
        private static synchronized int nextThreadNum() {
            return threadInitNumber++;
        }

         */
    }
}
