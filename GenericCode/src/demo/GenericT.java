package demo;

public class GenericT<T> {
    private T t;

    public GenericT(T t) {
        this.t = t;
    }

    public GenericT() {
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
