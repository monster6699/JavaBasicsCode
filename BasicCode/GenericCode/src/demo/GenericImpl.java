package demo;

public class GenericImpl<T> implements GenericInterface<T> {
    @Override
    public void show(T t) {
        System.out.println(t);
    }
}
