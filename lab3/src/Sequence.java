public abstract class Sequence<T> {
    protected T value;
    boolean hasNext() {return true;}
    T next() {return value;}
}
