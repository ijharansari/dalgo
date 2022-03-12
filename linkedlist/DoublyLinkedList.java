public class DoublyLinkedList {
    Node root;

    class Node {
        int data;
        Node prev, next;

        public Node(int data) {
            this.data = data;
            prev = next = null;
        }
    }

    public void push(int data) {
        //check if root node exists
        if(root == null) {
            root = new Node(data);
            return;
        }

        //create new node
        Node newNode = new Node(data);
        newNode.next = root;
        root.prev = newNode;
        root = newNode;
    }

    public void append (int data) {
        //check if root node exists
        if(root == null) {
            root = new Node(data);
            return;
        }

       /* 
        --find the last node
        -create new node and link them
       */

       Node lastNode = root;
       while(lastNode.next != null) {
           lastNode = lastNode.next;
       }

       //creating new node 
       Node newNode = new Node(data);
       lastNode.next = newNode;
       newNode.prev = lastNode;
    }

    public void print() {
        //if no node is present
        if(root == null) {
            System.out.println("Node node is present");
            return;
        }
        int count = 0;
        Node startNode = root;
        while(count<20) {
            count++;
            System.out.print(startNode.data+"-->");
            startNode = startNode.next;
        }
    }

    public static void main(String args[]){
        DoublyLinkedList list = new DoublyLinkedList();
        list.append(1);
        list.append(2);
        list.append(4);
        list.append(3);
        list.print();
    }
}
