package demo01;

public class innerAnnotation {

    /*
     * JDK中预定义的一些注解
         * @Override	：检测被该注解标注的方法是否是继承自父类(接口)的
         * @Deprecated：该注解标注的内容，表示已过时
         * @SuppressWarnings：压制警告
         * 一般传递参数all  @SuppressWarnings("all")
     */
    @Override
    public String toString() {
        return "innerAnnotation{}";
    }

    @Deprecated
    public void show1() {
        System.out.println("show1");
    }

    @SuppressWarnings("all")
    public void show2() {
        System.out.println("show2");
    }

    public void show() {
        show1();
        show2();
    }





}
