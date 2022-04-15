/**
 * Given two linked list of same size
 * Find the sum of two linked list in reversed order
 * Resulting sum must be another linked list
 * Example
 * 1-->4-->3
 * 2-->6-->4
 * ---------
 * 3-->0-->8
 */
class Nod {
    int data;
    Nod next;

    //constructor for creating Node
    Nod(int data) {
        this.data = data;
    }
    Nod(){}
}
class SinList {
    Nod root;
    public void push(int data) {
        //check if root node exists
        if(root == null) {
            root = new Nod(data);
            return;
        }

        Nod newNode = new Nod(data);

        //find last node
        Nod lasNode = root;
        while(lasNode.next != null) {
            lasNode = lasNode.next;
        }
        lasNode.next = newNode;
    }

    public void display() {
        if(root == null) {
            System.out.println("No node in list");
            return;
        }
        Nod lastNode = root;
        while(lastNode != null) {
            System.out.println(lastNode.data);
            lastNode = lastNode.next;
        }
    }
}
public class AddTwoLinkedList {
    public SinList sumTwoLinkedList(Nod linkedList1, Nod linkedList2) {
        //logic
        /**
         * Iterate through one day,
         * get each node value,
         * add the value
         * find the carry
         * add the resulted value in new node
         */
        SinList sumedNode = new SinList();
        Nod firstNode = linkedList1;
        Nod secondNode = linkedList2;
        int sum = 0, carry = 0;
        while(firstNode != null) {
            sum = firstNode.data + secondNode.data + carry;
            carry = 0;
            if(sum > 9) {
                carry = sum/10;
                sum = sum%10;
            }
            //creating summed node
            sumedNode.push(sum);
            firstNode = firstNode.next;
            secondNode = secondNode.next;
            if(firstNode == null) {
                if(carry > 0) {
                    sumedNode.push(carry);
                }
            }
        }
        return sumedNode;
    }

    public static void main(String args[]) {
        AddTwoLinkedList add = new AddTwoLinkedList();
        SinList list1 = new SinList();
        SinList list2 = new SinList();
        list1.push(9);
        list1.push(1);
        list1.push(1);
        list1.push(1);

        list2.push(9);
        list2.push(1);
        list2.push(1);
        list2.push(1);

        SinList sumedList = add.sumTwoLinkedList(list1.root, list2.root);
        sumedList.display();

    }
}
