package demo;

public class InterfaceDemoMain {
    public static void main(String[] args) {
        InterfaceDemo01.work1();
        InterfaceDemo01.work2();
        InterfaceDemo01Impements interfaceDemo01Impements = new InterfaceDemo01Impements();
        interfaceDemo01Impements.sleep1();
        interfaceDemo01Impements.sleep2();

    }
}
