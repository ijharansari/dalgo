import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/* 
    Get the K elements with highest number of repeatation
    For example
    [1,1,1,2,2,3] , K =2, [1,2] ,because 1 and 2 are repeated the highest

    solution
    -sort the array 
    -count while the next element is equal to prev on
    -if not, add the element into Tree map
    -Iterate the map reversively k time and print the element
*/
public class TopKElement {
    public static void main(String args[]) {
        int arr[] = {4,1,-1,2,-1,2,3};
        Arrays.sort(arr);
        int prev = arr[0];
        int index = 1;
        int count = 1;
        Map<Integer, Integer> itemsCount = new TreeMap<>(Collections.reverseOrder());
        while(index<arr.length) {
            if(prev == arr[index]) {
                count++;
            }else {
                itemsCount.put(count, prev);
                count = 1;
                prev = arr[index];
            }
            index++;
        }
        itemsCount.put(count, prev);
        int repeateElements[] = new int [3];
        int i = 0;
        for(Map.Entry m: itemsCount.entrySet()) {
            repeateElements[i] = (int)m.getValue();
            System.out.println(m.getKey()+" "+ m.getValue());
            /* i++;
            if(i == repeateElements.length) {
                break;
            } */
        }
        for(int a: repeateElements) {
            System.out.println(a);
        }
    }
}
