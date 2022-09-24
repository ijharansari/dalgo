import java.util.*;
class Main {
	public Set<Integer[]> findElements(int[] datas, int sum) {
		Set<Integer> elements = new HashSet<Integer>();
		Set<Integer[]> allElems = new HashSet<>();
		Integer []foundElements = new Integer[2];
		for(Integer data: datas) {
			if(elements.contains(sum-data)) {
				foundElements = new Integer[2];
				foundElements[0] = data;
				foundElements[1] = sum-data;
				allElems.add(foundElements);
        //un comment break, if you need to only find a pair of element
        //break;
				
			}
			elements.add(data);
		}
		return allElems;
	}
	public static void main(String args[]) {
		// Your code goes here
		Main main = new Main();
		int[] datas = {8,5,2,4,3,7,6,9,1};
		Set<Integer[]> elems = main.findElements(datas,9);
		
		for(Integer[] elem: elems) {
			System.out.println(elem[0]+", "+elem[1]);
		}
		
	}
}
