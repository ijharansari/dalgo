import java.util.Arrays;

public class FindNthLargestNumber {
    public int findNthLargestNumber(int arr[], int nth) {
        int arrLength = arr.length;

        if(nth>arrLength || nth<1) return -1;

        Arrays.sort(arr); //sorted the array in asc order

        int index = arrLength;
        while(nth>0 && index>-1) {
            if(arr[index-1] != arr[index-2]) {
                nth--;
            }
            index--;
        }

        return arr[index];
    }

    public static void main(String args[]) {
        FindNthLargestNumber fl = new FindNthLargestNumber();
        int arr[] = {1,3,2,6,4,5};
        int nth = fl.findNthLargestNumber(arr, 5);
        System.out.println("nth Largest number"+ nth);
    }
}
