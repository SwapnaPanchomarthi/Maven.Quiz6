package rocks.zipcode.io.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;


public class GenericUtils {
    /**
     * @param collection - collection to be converted to an array
     * @param <T>        - type of collection
     * @return array with contents identical to `collection`
     */
    public static <T> T[] toArray(Collection<T> collection) {
        List<T> list = (List<T>) Arrays.asList(collection);
        T[] newArr;
        int n=list.size();
        newArr = (T[])new Object[n];
        list.toArray(newArr);
        return newArr;
    }
}
