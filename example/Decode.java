/* 
    1111 -> 1,1,1,1 11,1,1  1,11,1  1,1,11

    1234 -> [1,2,3,4], [12,3,4], [1,23,4],
    1,2,3,4,12,23,34, 
    10302
    1,0,3,0,2,10,03,30,02
    0123

    check the lenght is 1 or 2, so we can check they are are not greater that 26, return count 1;
    06, 03 -> convert this into array, check if the first element is not 0

    constrain 
        -leading zero
        -only consider string of length less 0<elem<3
*/
public class Decode {
    public String[] getEncodedValue(String str) {
        //check if the length is 1
        //check if the length is 2
        String[] temArr = new String[str.length()*2-1];
        int count=0;
        int j = 1;
        for(int i=0; i<str.length(); i++) {
            if(j<= str.length()){
                temArr[count] = str.substring(i, j);
            }
            j++;
            count++;
        }

        j=2;
        for(int i=0; i<str.length(); i++) {
            if(count >= temArr.length) {
                break;
            }
            if(j<= str.length()){
                temArr[count] = str.substring(i, j);
            }
            
            j++;
            count++;
        }

        return temArr;
    }

    public static void main(String... args) {
        char [] alphabet = {'0','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        Decode de = new Decode();
        String[] arr = de.getEncodedValue("1023");
        int index =0;
        for(String ar: arr) {
            if(ar.length() == 2) {
                if(ar.substring(0, 1) != "0") {
                    index = Integer.parseInt(ar);
                    if(index<27) {
                        System.out.print(alphabet[index]);
                    }
                } 
            }else {
                index = Integer.parseInt(ar);
                if(index>0) {
                    System.out.print(alphabet[index]);
                } 
            }  
        }

    }
}
