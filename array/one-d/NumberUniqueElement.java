public class NumberUniqueElement {
    public int moveElements(int[] arr) {
        int pointer1= 0;
        int pointer2 = 1;

        int newLength = arr.length;
        while(pointer2<arr.length) {
        if(arr[pointer1] == arr[pointer2]) {
            newLength--;
        }
        pointer1++;
        pointer2++;
        }
        return newLength;
    }
}