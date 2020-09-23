package demo2;

public class InterfaceDemoExtendsIml implements InterfaceDemoExtends {
    @Override
    public void demoExtend() {
        System.out.println("多继承接口方法");
    }

    @Override
    public void interface04() {
        System.out.println("04");
    }

    @Override
    public void interface05() {
        System.out.println("05");
    }
}
