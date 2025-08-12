/**
 * Reverse an array in place
 * 
 * Example:
 * arr[] = {1,2,3,4,5,6}
 * 
 * Answer:
 * arr[] = 6,5,4,3,2,1
 */
public class ReverseArray {
    public void reverseArray(int arr[]) {
        int i=0;
        int j = arr.length-1;

        while(j>i) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;j--;
        }
    }

    public static void main(String args[]) {
        ReverseArray ra = new ReverseArray();
        int arr[] = {1,2,3,4};
        ra.reverseArray(arr);

        for(int a: arr) {
            System.out.println(a);
        }
    }
}