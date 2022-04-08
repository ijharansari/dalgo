/**
 * This class separate char and number
 */
public class Separator {
    public static void main(String args[]) {
        String words="abc32A4ds3dse23";

        /* 
            Steps
                -break workds in char array
                -Iterate through each items in char array,
                -Check if they are char or number,
                -Add the elements into their respective items
        */
        //convert words to char
        char[] charItems = words.toCharArray();

        //create two array for respective items type
        StringBuilder stringVal = new StringBuilder();
        StringBuilder numVal = new StringBuilder();
        for(char item: charItems) {
            if((item >= 'a' && item <= 'z') || item >='A' && item<='Z') {
                stringVal.append(item);
            }else if(item>='0' && item<='9') {
                numVal.append(item);
            }
            //else the characters may tab, enter, new line etc
        }

        System.out.println("String value: "+ stringVal.toString());
        System.out.println("Num value: "+ numVal.toString());
    }
}