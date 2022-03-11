
/**
 * Example demonstrating Single list list
 */
public class SingleLinkList {
    Node root;

    class Node{
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public void push(int data) {
        //check if we have root node
        if(root == null) {
            root = new Node(data);
            return;
        }

        Node newNode = new Node(data);
        newNode.next = root;
        root = newNode;
    }

    public void append(int data) {
        //check if root node exists
        if(root == null) {
            root = new Node(data);
            return;
        }

        //finding last node
        Node lastNode = root;
        while(lastNode.next != null) {
            lastNode = lastNode.next;
        }

        Node newNode = new Node(data);
        lastNode.next = newNode;
    }

    public void print() {
        if(root == null) {
            System.out.println("No list exists");
            return;
        }

        //starting point
        Node startNode= root;
        while (startNode != null){
            System.out.print(startNode.data+"-> ");
            startNode = startNode.next;
        }
    }

    public static void main(String [] args) {
        SingleLinkList list = new SingleLinkList();
        list.push(1);
        list.append(2);
        list.append(3);
        list.push(4);
        list.append(5);
        list.print();
    }
}
