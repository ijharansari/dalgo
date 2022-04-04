public class StringToArrString {
    public static void main(String[] args){
        String str = "javedansari";
        String tempStr = null;
        String [] strArray = new String[str.length()/3] ;
        if(str.length()%3 != 0) {
            tempStr = str.substring(str.length()/3*3);
            str = str.substring(0,str.length()/3*3);
            strArray = new String[str.length()/3+1] ;
        }

        int pointer=0, i=0;

        while (true) {
            if(pointer>str.length()) {
                break;
            }
            strArray[i] = str.substring(pointer, pointer+3);
            i++;
            pointer= pointer+3;
        }
        strArray[i]=tempStr;

        for(String arr: strArray) {
            System.out.println(arr);
        }

    }
}