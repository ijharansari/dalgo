/* 
    123 = 3^2+ 2^1+ 1^3 = 12;
*/

public class PowerSum {
    public static void main(String [] args) {
        int input = 0;
        int temp = input%10;
        input = input/10;
        int lastNumber = temp, secondLastNumber = input%10;
        int sum = 0;
        sum = sum + (int)Math.pow(lastNumber, secondLastNumber);
        for(int i = 0; i< Integer.toString(input).length()+1; i++) {
            lastNumber = input%10;
            input = input/10;
            System.out.println("This is the inside "+ input);
            if(input == 0) {
                secondLastNumber = temp;
            }else {
                secondLastNumber = input%10;
            }
            sum = sum + (int)Math.pow(lastNumber, secondLastNumber);
            if(input == 0) {
                break;
            }
        }

        System.out.println(sum);
    }
}
