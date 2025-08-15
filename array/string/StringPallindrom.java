/**
 * Given a string s, return true if it is a palindrome, or false otherwise.
 * If there are any special character, or space, we should remove them too
 * 
 * 
 * Solution
 * iterate from end (Reverse array)
 * while get the nth-1 char element and check wether it is char or digit
 * if they are char or digit, I will add it into another string object and repeat
 */

public class StringPallindrom {
    public String checkPallindrom(String text) {
        if(text == null) {
            return null;
        }

        StringBuilder strBuilder = new StringBuilder();
        for(int i=text.length()-1; i>=0; i--) {
            if(Character.isLetterOrDigit(text.charAt(i))) {
                strBuilder.append(Character.toLowerCase(text.charAt(i)));
            }
        }
        return strBuilder.toString();
     }

     public static void main(String[] args) {
        StringPallindrom sp = new StringPallindrom();
        String s = sp.checkPallindrom("A man, a plan, a canal, Panama!");
        System.out.println(s);
     }
}