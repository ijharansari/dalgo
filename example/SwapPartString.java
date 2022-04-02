/* 
    AA BB CC DD E
    int i=0; i+4;
    -find the length of the String
    -get it by length mode 4,
    -get length - mod,
    -get 0 to length-mod string
    -get length-mod string
    -lower pointer
    -higher pointer 

*/
public class SwapPartString {
    public static void main(String args[]) {
        String words = "AAB";
        if(words.length() < 4) {
            System.out.println(words);
            return;
        }
        int mod = words.length()%4;
        String tempWords = words.substring(words.length()-mod);
        words = words.substring(0,words.length()-mod);

        StringBuffer sBuffer = new StringBuffer();

        int lowPointer = 0, highPointer = 2;

        while(words.length()>highPointer) {
            sBuffer.append(words.substring(highPointer, highPointer+2));
            sBuffer.append(words.substring(lowPointer,lowPointer+2));
            highPointer = highPointer+4;
            lowPointer = lowPointer + 4;
        }

        if(tempWords != null || tempWords != "") {
            sBuffer.append(tempWords);
        }
        System.out.println(sBuffer.toString());


    }
}
