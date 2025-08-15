import java.util.*;


/**
 * Given a string s, reverse only all the vowels in the string and return it.
  The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
Example 1:
Input: s= "hello"
Output: "holle"
 */
public class ReverseOnlyVowels {
    public String swapVowels(String str) {
        if(str == null) return null;

        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        char[] strChar = str.toCharArray();

        int i=0;
        int j = strChar.length;

        while(j>i) {
            if(vowels.contains(Character.toLowerCase(strChar[i]))) {
                if(vowels.contains(Character.toLowerCase(strChar[j-1]))) {
                    //swapping
                    char temp = strChar[i];
                    strChar[i] = strChar[j-1];
                    strChar[j-1] = temp;
                    i++;
                }
                j--;
            }else {
                i++;
            }
        }

        str = new String(strChar);
        return str;
    }

    public static void main(String[] args) {
        ReverseOnlyVowels rov = new ReverseOnlyVowels();
        String name = "aaaa";
        String revName = rov.swapVowels(name);
        System.out.println(revName);
    }
}