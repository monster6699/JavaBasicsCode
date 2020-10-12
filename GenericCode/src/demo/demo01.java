package demo;

public class demo01 {
    public static void main(String[] args) {
        GenericT<String> stringGenericT = new GenericT<String>();
        stringGenericT.setT("aaa");
        System.out.println(stringGenericT.getT());
        GenericT<Integer> intGenericT = new GenericT<Integer>();
        intGenericT.setT(20);
        System.out.println(intGenericT.getT());
        System.out.println("----------------------------");
        GenericMethod genericMethod = new GenericMethod();
        genericMethod.show("aaa");
        genericMethod.show(10);
        genericMethod.show(true);

        System.out.println("----------------------------");
        GenericImpl<String> stringGeneric = new GenericImpl<>();
        stringGeneric.show("aaaa");

        GenericImpl<Integer> integerGeneric = new GenericImpl<>();
        integerGeneric.show(10);


    }

}
