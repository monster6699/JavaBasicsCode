package demo;

import java.util.ArrayList;

public class GenericWildcard {
    public static void main(String[] args) {
        ArrayList<? extends Number> numbers = new ArrayList<Number>();
        ArrayList<? extends Number> numbers2 = new ArrayList<Integer>();
//        ArrayList<? extends Number> numbers3 = new ArrayList<Object>();

        ArrayList<? super Number> sp1 = new ArrayList<Number>();
        ArrayList<? super Number> sp2 = new ArrayList<Object>();
//        ArrayList<? super Number> sp3 = new ArrayList<Integer>();


    }
}
