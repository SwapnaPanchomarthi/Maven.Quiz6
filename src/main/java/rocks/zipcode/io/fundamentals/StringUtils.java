package rocks.zipcode.io.fundamentals;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author leon on 10/01/2019.
 */
public class StringUtils {
    /**
     * @param string - string to be evaluated
     * @return collection containing all permutations of casing of this string
     */
    public static Collection<String> getAllCasings(String string) {
        // get length of string
        // get range of length
        // get power-set of range

        // for every set in power-set
            // uppercase indices of string using set

        int n = string.length();

        // Number of permutations is 2^n
        int max = 1 << n;

        // Converting string to lower case
        string = string.toLowerCase();

        char combination[] = string.toCharArray();
        // Using all subsequences and permuting them
        for(int i = 0;i < max; i++)
        {


            // If j-th bit is set, we convert it to upper case
            for(int j = 0; j < n; j++)
            {
                if(((i >> j) &  1) == 1)
                    combination[j] = (char) (combination[j]-32);
            }

            // Printing current combination
            System.out.print(combination);
            System.out.print("   ");
        }
        List<Character> list = new ArrayList<>();
        for (char c : combination) {
            list.add(c);
        }


        return null;
    }

    /**
     * @param string  - string to be evaluated
     * @param indices - indices to be evaluated
     * @return near-identical string whose characters at specified indices are capitalized
     */
    public static String upperCaseIndices(String string, Integer... indices) {
        String outputString = "";
        int n=string.length();
        char[] chars=string.toCharArray();

        char [] newArr = new char[n];

        int index=0;
        for(int i=0; i<=n; i++) {

           try{ if(i==indices[i]) {
                newArr[index] = Character.toUpperCase(chars[i]);
            }
            else {
                newArr[index] = chars[i];
            }}catch (ArrayIndexOutOfBoundsException exception) {
               // Output expected ArrayIndexOutOfBoundsException.
               System.out.println(exception);}
//            if (Character.isUpperCase(string.charAt(i)))
//                indices[index] = i;
//                index++;
            index++;
        }
        outputString = String.valueOf(newArr);

        return outputString;
    }

    /**
     * @param stringToBeManipulated - string to be evaluated
     * @param valueToBeInserted     - value to insert into string
     * @param index                 - string-index at which to insert value into string
     * @return near-identical string with `valueToBeInserted` inserted at `index`
     */



    public static String insertAtIndex(String stringToBeManipulated, String valueToBeInserted, Integer index) {


        StringBuilder str = new StringBuilder(stringToBeManipulated);
        System.out.println(str);
        str.insert(index, valueToBeInserted);

        // prints StringBuilder after insertion
        System.out.print("After insertion = ");
        System.out.println(str.toString());


        // return the modified String
        return str.toString();
    }

    /**
     * @param stringToBeManipulated - string to be evaluated
     * @param replacementValue      - value to insert at `index`
     * @param index                 - position of string to be manipulated
     * @return near-identical string with character at `index` replaced with `replacementValue`
     */
    public static String replaceAtIndex(String stringToBeManipulated, Character replacementValue, Integer index) {
        return stringToBeManipulated.substring(0, index) + replacementValue + stringToBeManipulated.substring(index+1);
    }
}