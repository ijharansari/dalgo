/* Example of simple binary tree */
/* class Node {
    int data;
    Node left, right;
    Node(int data) {
        this.data = data;
        left = right = null;
    }
} */
public class BinaryTree {
    Node parent;
    BinaryTree(int data) {
        parent = new Node(data);
    }

    //travel
    public void inOrder(Node node) {
        if(node == null) {
            System.out.println("No elements in tree");
            return;
        }

        inOrder(node.left);
        System.out.print(node.data+ "=>");
        inOrder(node.right);
    }
    public void inOrder() {
        inOrder(parent);
    }
    public static void main(String [] args) {
        BinaryTree tree = new BinaryTree(1);
        Node parent = tree.parent;
        parent.left = new Node(2);
        parent.right = new Node(3);

        parent.left.left = new Node(4);
        parent.left.right = new Node(5);

        tree.inOrder();
    }
}
