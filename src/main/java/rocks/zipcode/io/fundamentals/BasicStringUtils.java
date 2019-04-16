package rocks.zipcode.io.fundamentals;

import java.util.ArrayList;
import java.util.List;

public class BasicStringUtils {
    /**
     * @param chars - characters used to instantiate a new string object
     * @return new String which wraps the arguments passed in
     */
    public static String getString(char[] chars) {
        String s =  String.copyValueOf(chars);
        return s;
    }

    /**
     * @param chars - characters used to instantiate a new string object
     * @return new String which wraps the arguments passed in
     */
    public static String getString(Character[] chars) {
        List<Character> list= new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            list.add(c);
        }
        for(Character character:list)
        {
            sb.append(character);
        }


        return sb.toString();
    }

    /**
     * @param string - string to be manipulated
     * @return identical string with lowercase and uppercase vowels removed
     */
    public static String removeAllVowels(String string) {
        char[] c = string.toCharArray();

        List<Character> list = new ArrayList<>();

         for(int i=0; i<c.length; i++)
         {
             if(!((string.charAt(i) == 'a') ||
                     (string.charAt(i) == 'e')  ||
                     (string.charAt(i) == 'i') ||
                     (string.charAt(i) == 'o') ||
                     (string.charAt(i) == 'u')||(string.charAt(i) == 'A') ||
                 (string.charAt(i) == 'E')  ||
                 (string.charAt(i) == 'I') ||
                 (string.charAt(i) == 'O') ||
                 (string.charAt(i) == 'U')))
                // newChar[i]=c[i];
                 list.add(Character.valueOf(c[i]));
         }
        int index=0;
        char[] newChar = new char[list.size()];
         for(int i=0; i<list.size();i++)
         {
             newChar[index]=list.get(i);
             index++;
         }
        String s =  String.copyValueOf(newChar);

        return s;
    }

    /**
     * @param string             - string to be manipulated
     * @param charactersToRemove - characters to be removed from string
     * @return
     */
    public static String removeSpecifiedCharacters(String string, String charactersToRemove) {
//        char[] c = string.toCharArray();
//
//        List<Character> list = new ArrayList<>();
//
//        for(int i=0; i<c.length; i++)
//        {
//            if(!(c[i]==charactersToRemove))
//                list.add(Character.valueOf(c[i]));
//
//        }
        return string.replaceAll(charactersToRemove,"");

    }
}
