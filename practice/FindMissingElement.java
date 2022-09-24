import java.util.Arrays;
class FindMissingElement {
	public void findMissingElement(int []data) {
		int flag = 0;
		//sort the array
		Arrays.sort(data);
		
		//check if 1 is present
		if(data[0] != 1) {
			System.out.println("1 is not present");
			return;
		}
		
		for(int d: data) {
			if(d == flag+1) {
				flag++;
			}else {
				System.out.println(flag+1+" is missing");
				return;
			}
		}
	}
	public static void main(String args[]) {
		// Your code goes here
		FindMissingElement main = new FindMissingElement();
		int[] data = {8,5,2,4,3,7,6,9};
		main.findMissingElement(data);
	}
}
