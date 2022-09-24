public class LinkedSet {
	class Node{
		int data;
		Node next;
		Node(int data) {
			this.data = data;
			next = null;
		}
	}
	
	Node head;
	public void add(int data) {
		//check if head is present
		if(head == null) {
			head = new Node(data);
			return;
		}
		
		//otherwise insert in sorted manner
		
		//condition for adding data at front
		if(head.data > data) {
			Node newNode = new Node(data);
			newNode.next = head;
			head = newNode;
			return;
		}
		
		Node thisNode = head;
		Node newNode = null;
		Node tempNode = null;
		while(thisNode.next != null) {
			newNode = new Node(data);
			if(thisNode.next != null && thisNode.data < data && thisNode.next.data > data) {
				tempNode = thisNode.next;
				thisNode.next = newNode;
				newNode.next = tempNode;
				break;			
			}else {
				thisNode = thisNode.next;
			}
		}
		
		//check if the element is to be added at last
		if(thisNode.next == null && thisNode.data<data) {
			thisNode.next = new Node(data);
		}
	}
	
	public void display() {
		Node thisNode = head;
		while(thisNode != null) {
			System.out.println("-->"+thisNode.data);
			thisNode = thisNode.next;
		}
	}
	public static void main(String args[]) {
		// Your code goes here
		LinkedSet set = new LinkedSet();
		
		set.add(2);
		set.add(3);
		set.add(5);
		set.add(4);
		set.add(1);
		set.add(10);
		set.add(-1);
		set.display();
	}
}