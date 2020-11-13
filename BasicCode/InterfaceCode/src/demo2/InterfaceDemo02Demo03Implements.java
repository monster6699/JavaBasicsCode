package demo2;

public class InterfaceDemo02Demo03Implements implements InterfaceDemo01, InterfaceDemo02 {
    @Override
    public void interface01() {
    }
    @Override
    public void interface02() {
    }
    @Override
    public void method() {
    }
    // 如果有重复默认方法的必须覆盖重写
    @Override
    public void defaultMethod() {
    }
}
