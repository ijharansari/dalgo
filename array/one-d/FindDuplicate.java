/**
 * Given an integer array nums, 
 * return true if any value appears at least twice in the array, 
 * and return false if every element is distinct.
 * 
 * Solution
 * 1. Using nested approach (TC-> O(n^2), SP -> O(1))
 * 2. Using hash set (TC-> O(n), SP -> O(n))
 * 3. By sorting element (TC-> O(n), SP -> O(logn))
 */

import java.util.*;

public class FindDuplicate {
    public boolean hasDuplicate(int arr[]) {
        Arrays.sort(arr);

        for(int i=0; i<arr.length-1; i++) {
            if(arr[i] == arr[i+1]) return true;
        }
        return false;
    }

    public static void main(String args[]) {
        FindDuplicate fd = new FindDuplicate();
        int arr[] = {1,2,3,4,5};
        boolean hasD = fd.hasDuplicate(arr);

        if(hasD) {
            System.out.println("Has duplicate array");
        }else {
            System.out.println("Doesn't have duplicate array");
        }
    }
}