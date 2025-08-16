import java.util.*;

public class Anagram {
    public boolean isAnagram(String s, String t) {
        // TODO: Write your code here
        char[] ss = s.toCharArray();
        char[] ts = t.toCharArray();

        Arrays.sort(ss);
        Arrays.sort(ts);

        return Arrays.equals(ss,ts);
    }

    public static void main(String[] args) {
        Anagram a = new Anagram();
        String s = "car";
        String t = "rat";
        boolean b = a.isAnagram(s,t);

        System.out.println("Both string are Anagram? "+ b);
    }
}