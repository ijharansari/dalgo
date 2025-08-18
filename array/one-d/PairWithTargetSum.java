public class PairWithTargetSum {
    public int[] getTargetSum(int[] arr, int targetSum) {
        int pointer1 = 0;
        int pointer2 = arr.length-1;
        int []newArr = new int[2];
        while(pointer1<pointer2) {
            int currentSum = arr[pointer1] + arr[pointer2];

            if(currentSum == targetSum) {
                newArr[0] = arr[pointer1];
                newArr[1] = arr[pointer2];
                return newArr;
            }

            if(currentSum<targetSum) {
                pointer1++;
            }

            if(currentSum>targetSum) {
                pointer2--;
            }
        }
        return newArr;
    }

    public static void main(String []args) {
        PairWithTargetSum pts = new PairWithTargetSum();
        int []arr = {1,2,3,4,5,6};
        int []ars = pts.getTargetSum(arr,5);

        for(int d:ars) {
            System.out.println("element->"+d);
        }


    }
}