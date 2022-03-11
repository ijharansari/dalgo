/* 
    Problem statement
    Given an array and [lowVal, MaxVal]
    Every element in array less than lowVal should appear before lowVal
    Every element in array more than or equal to MaxVal should appear after MaxVal

    Input: arr[] = {1, 14, 5, 20, 4, 2, 54, 20, 87, 98, 3, 1, 32}, lowVal = 14, highVal = 20
    Output: arr[] = { 1 5 4 2 3 1 14 20 20 54 87 98 32 }

    Input: arr[] = {1, 14, 5, 20, 4, 2, 54, 20, 87, 98, 3, 1, 32}, lowVal = 20, highVal = 20       
    Output: arr[] = { 1 14 5 4 2 3 1 20 20 54 87 98 32 } 
*/

/* 
    Approach
    -create a method for processing
    -create a temp array of size of original array
    -we can iterate through original array and based on condition, w
*/
public class QueueExample1 {
    public int[] processArray(int[] arr,int lowValue, int highValue)  {
        int index = 0;
        if(arr.length < 1) {
            System.out.println("Empty array");
            return new int[] {};
        }
        int [] tempArray = new int[arr.length];
        
        //actual logic
        //iterate for elements lower than lowValue
        for(int ar : arr) {
            if(ar<lowValue) {
                tempArray[index] = ar;
                index++;
            }
        }

        //appending high value after low value
        tempArray[index] = lowValue;
        index++;
        tempArray[index] = highValue;
        index++;
        //iterate for elements lower than lowValue
        for(int ar : arr) {
            if(ar>highValue) {
                tempArray[index] = ar;
                index++;
            }
        }
        return tempArray;
    }

    public static void main(String [] args) {
        QueueExample1 ex = new QueueExample1();
        int [] arr = ex.processArray(new int[]{1,5,6,3,4,2,9,7,8,10}, 6, 7);
        for(int ar: arr) {
            System.out.println(ar);
        }
    }
}
