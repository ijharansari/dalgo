/* 
    123 = 3^2+ 2^1+ 1^3 = 12;
    1234
    lastTwo = 34;
    sum = sum + 4^3;

    num = num/10;  123
    12
    1

*/

public class PowerSum {
    public static void main(String [] args) {
        int input = 22;
        
        if(Integer.toString(input).length() == 1) {
            System.out.println(input);
            return;
        }

        int sum = 0;
        //check if the size of the digit is 2
        if(Integer.toString(input).length() == 2) {
            System.out.println((int)Math.pow(input%10,input/10));
            return;
        }

        int temp = input%10;
        int lastTwo = 0;
        while(true) {
            lastTwo = input%100;
            if(Integer.toString(lastTwo).length() == 2) {
                sum = sum + (int)Math.pow(lastTwo%10, lastTwo/10);
            }else {
                sum = sum + (int)Math.pow(lastTwo,temp);
                break;
            }
            input = input/10;
        }

        System.out.println(sum);
    }
}
