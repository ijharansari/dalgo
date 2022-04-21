/**
 * This code is valid for only number who lenght is atmost the length of long int
 */
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class TwoLinkedListSumpublic ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    //creating number from ListNode 1
    ListNode firstNode = l1, secondNode = l2;
    long num1=0l, num2=0l, sum=0l;
    long placeValue = 1l;
    while(firstNode != null) {
        num1 = firstNode.val*placeValue + num1;
        placeValue = placeValue*10;
        firstNode = firstNode.next;
    }
    
    //creating number from list 2
    placeValue = 1l;
    while(secondNode != null) {
        num2 = secondNode.val*placeValue + num2;
        placeValue = placeValue*10;
        secondNode = secondNode.next;
    }
    
    sum = num1 + num2;
    char [] charVal = String.valueOf(sum).toCharArray();
    ListNode head = null;
    ListNode tempNode = null;
    ListNode newNode = null;
    if(sum == 0l) {
        return new ListNode(0);
    }
    for(char val: charVal) {
        int intVal = Character.getNumericValue(val);
        if (head == null) {
            head = new ListNode(intVal);
            tempNode = head;
        }else {
            newNode = new ListNode(intVal,tempNode);
            tempNode = newNode;
        } 
    }
    
    return tempNode;
} {
    
}
