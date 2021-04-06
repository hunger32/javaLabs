import java.util.Collection;

public class Helper {
    public static<T> Collection<T> appendAll1(Collection<T> arr1, Collection<? extends T> arr2) {
        arr1.addAll(arr2);
        return arr1;
    }

    public static<T> Collection<? super T> appendAll2(Collection<T> arr1, Collection<? super T> arr2) {
        arr2.addAll(arr1);
        return arr2;
    }
}
