class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
    }
    Node(Node next,int data) {
        this.next = next;
        this.data = data;
    } 
}
public class LinkedList {
    public static void main(String args[]) {
        Node head = new Node(1);
        Node node1 = new Node(head,2);
        Node node2 = new Node(node1,3);

        Node a = node2;
        while(a != null) {
            System.out.println(a.data);
            a = a.next;
        }
    }
}
445
555