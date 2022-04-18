class Node {
   int val;
   Node next;
   Node(int val) {
       this.val = val;
   } 
}
public class ListNode {
    Node head;
    public void mains() {
        head = new Node(10);

        Node newNode = new Node(12);
        head.next = newNode;
        head = newNode;

        newNode = new Node(13);
        head.next = newNode;
        head = newNode;

        Node a = head;
        while(a != null) {
            System.out.println(a.val);
            a = a.next;
        }
        
    }
    public static void main(String args[]) {
        ListNode ad = new ListNode();
        ad.mains();
    } 
}
