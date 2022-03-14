import java.util.List;
import java.util.ArrayList;
/* Normal tree example*/
/* 
                1
            /   |   \ 
            2   3   4
          / | \  \  | \
*/
class Node {
    int data;
    List<Node> children;

    Node(int data) {
        this.data = data;
        children = null;
    }
}
public class Tree {
    //create parent Node
    Node parent;

    Tree(int data) {
        parent = new Node(data);
    }

    public void traverse(Node node) {
        if(node == null) {
            return;
        }

        if(node.children != null && !node.children.isEmpty()) {
            for(Node child: node.children) {
                traverse(child);
            }
        }

        System.out.println(node.data+" =>");

    }
    public void traverse() {
        traverse(parent);
    }
    public static void main(String args[]) {
        Tree tree = new Tree(1);
        Node parent = tree.parent;
        parent.children = new ArrayList<>();
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        parent.children.add(a);
        parent.children.add(b);
        parent.children.add(c);
        a.children = new ArrayList<>();
        Node d = new Node(5);
        Node e = new Node(6);
        a.children.add(d);
        a.children.add(e);
        tree.traverse();
    }
}
