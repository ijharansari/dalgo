/**
 * Push all the zeros at the end of the arr
 * Solution: There are two ways to solve this. One is using temp array.
 * Another ways is to swap the array in the same array
 */
public class PushZeroToLast {
    public void pushZeroToLast(int arr[]) {
        if(arr == null || arr.length<1) return;

        int count = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
    }

    public static void main(String args[]) {
        PushZeroToLast pzl = new PushZeroToLast();
        int arr[] = {1,0,3,4,0,0,5,6};
        pzl.pushZeroToLast(arr);

        for(int d : arr) {
            System.out.println(d);
        }
    }
}