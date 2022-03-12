/**
 * [1,2,3] => [1,2,4]
 * which is equivalent to 123 + 1 = 124
 * [9,9,9] => [1,0,0,0]
 
 */
public class PlusOne {
    public int [] plusOne(int [] arr) {
        int size = arr.length-1;
        int num = 0;
        for(int ar: arr) {
            num = num + (ar * (int)Math.pow(10, size));
            size--;
        }
        num = num+1;
        System.out.println("The number is "+ num);
        return convertIntoArray(num);
    }

    public int [] convertIntoArray(int num) {
        int size = Integer.toString(num).length();
        int dividend = (int)Math.pow(10,size-1);
        int arr[] = new int[size];
        for(int i=0; i<arr.length; i++) {
            arr[i] = (int)num/dividend;
            num = num%dividend;
            dividend = dividend/10;
        }
        return arr;
    }

    public static void main(String args[]){
        PlusOne one = new PlusOne();
        int [] arr = one.plusOne(new int[]{0,0,9,9});
        for(int ar: arr) {
            System.out.print(ar+", ");
        }
    }
}
