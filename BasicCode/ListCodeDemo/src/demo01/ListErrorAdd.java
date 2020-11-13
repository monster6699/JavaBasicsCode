package demo01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListErrorAdd {
    public static void main(String[] args) {
        List<String> listErr = new ArrayList<>();
        listErr.add("one");
        listErr.add("two");
        listErr.add("three");
        listErr.add("four");
//        Iterator<String> iterator = listErr.iterator();
//        while (iterator.hasNext()) {
//            if(iterator.next() == "two") {
//                listErr.add("test"); //ConcurrentModificationException
//            }
//        }

        for (int i = 0; i < listErr.size(); i++) {
            if (listErr.get(i).equals("two")) {
                listErr.add("test");
            }
        }
        System.out.println(listErr);

        LinkedList<String> linkStr = new LinkedList<>();
        linkStr.add("11");
        linkStr.add("12");
        linkStr.add("13");
        linkStr.add("14");
        String first = linkStr.getFirst();
        System.out.println(first);
        String last = linkStr.getLast();
        System.out.println(last);

        linkStr.addFirst("00");
        linkStr.addLast("14");
        System.out.println(linkStr);

        String s1 = linkStr.removeFirst();
        System.out.println(s1);
        String s = linkStr.removeLast();
        System.out.println(s);
        System.out.println(linkStr);

        /*
    public Iterator<E> iterator() {
        return new Itr();
    }
    public boolean add(E e) {
        modCount++;
        add(e, elementData, size);
        return true;
    }
    private class Itr implements Iterator<E> {
        int cursor;       // index of next element to return
        int lastRet = -1; // index of last element returned; -1 if no such
        int expectedModCount = modCount;

        // prevent creating a synthetic constructor
        Itr() {}

        public boolean hasNext() {
            return cursor != size;
        }

        @SuppressWarnings("unchecked")
        public E next() {
            checkForComodification();
            int i = cursor;
            if (i >= size)
                throw new NoSuchElementException();
            Object[] elementData = ArrayList.this.elementData;
            if (i >= elementData.length)
                throw new ConcurrentModificationException();
            cursor = i + 1;
            return (E) elementData[lastRet = i];
        }

       final void checkForComodification() {
            if (modCount != expectedModCount)
                throw new ConcurrentModificationException();
        }
      }
    */
    }
}
