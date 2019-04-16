package rocks.zipcode.io.arrays;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author leon on 24/01/2019.
 */
public class ArrayUtils {
    /**
     * @param start - value to begin counting
     * @param end   - value to stop counting
     * @return array of all integers between `start` and `stop`
     */
    public static Integer[] getRange(Integer start, Integer end) {
        Integer[] range = new Integer[end-start+1];
        int index =0;
       for(int i=start; i<=end;i++)
       {
           range[index]= i;
           index++;
       }
        return range;
    }

    /**
     * @param array - array to be unboxed
     * @return array with identical contents in primitive-array form
     */
    public static char[] unbox(Character[] array) {
//        List<Character>  list = new ArrayList<>();
//        for(int i=0; i<array.length;i++)
//        {
//            list.add(Character.valueOf(array[i]));
//        }
        char[] characters = Arrays.stream(array)
                .map(ch -> ch.toString())
                .collect(Collectors.joining())
                .toCharArray();

        return  characters;
    }

    /**
     * @param array - array to be boxed
     * @return array with identical contents in nonprimitive-array form
     */
    public static Character[] box(char[] array) {
        List<Character>  list = new ArrayList<>();
        for(int i=0; i<array.length;i++)
        {
            list.add(Character.valueOf(array[i]));
        }
        Character[] characters = new Character[array.length];
        list.toArray(characters);

       return  characters;
}}
