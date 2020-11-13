package demo1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionArrayListEach {
    public static void main(String[] args) {
        Collection<String> arrList = new ArrayList<>();
        arrList.add("one");
        arrList.add("two");
        arrList.add("three");
        arrList.add("four");

        /*
        public ArrayList(Collection<? extends E> c) {
            public Iterator<E> iterator() {
                return new Itr();
            }
            // 内部类
            private class Itr implements Iterator<E> { }
        }
         */

        Iterator<String> iterator = arrList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
