/* Example of binary search */
/* 
    find the possible position of elements in sorted array
*/
public class BinarySearch {
    int arr[];
    public void binarySearch(int data) {
        if(arr.length <1) {
            System.out.println("Array is empty");
            return;
        }

        //binary search
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;


        while(low<=high){
            mid = low + (high - low)/2;
            if(arr[mid] == data) {
                System.out.println("Data found at index "+ mid);
                return;
            }

            if(data > arr[arr.length-1]) {
                System.out.println("Data found at index " + (arr.length));
                return;
            }

            if(data < arr[0]) {
                System.out.println("Data found at index " + 0);
                return;
            }
            if(mid< arr.length-1 && data > arr[mid] && data < arr[mid+1]) {
                System.out.println("Data found at index "+ (mid+1));
                return;
            }

            if(data > arr[mid]) {
                low = mid+1;
            }else {
                high = mid-1;
            } 
        }
    }

    public static void main(String args[]) {
        BinarySearch bn = new BinarySearch();
        bn.arr = new int[]{2,3,6,7};
        bn.binarySearch(6);
    }
}
