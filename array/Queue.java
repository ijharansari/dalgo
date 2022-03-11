/**
 * -FIFO principle
 * -method to create queue
 * -method to delete element in queue
 * -
 * 
 */
public class Queue {
    private final int LENGTH = 10;
    int arr[] = new int[LENGTH];
    int rare = 0;
    int size = Integer.MIN_VALUE;


    

    public void append(int data) {
        if(rare == LENGTH) {
            System.out.println("Queue is full");
            return;
        }

        arr[rare] = data;
        size++;
        rare++;
    }

    public void dequeue() {
        if(rare == 0) {
            System.out.println("No elements in queue");
            return;
        }
        arr[0] = 0;

        //shift the array
        for(int i=0; i<arr.length; i++) {
            if(i<arr.length-1) {
                arr[i] = arr[i+1];
            }
        }
        size--;
    }

    public void print() {
        for(int ar: arr) {
            System.out.println(ar);
        }
    }

    public static void main(String args[]) {
        Queue queue = new Queue();
        queue.append(1);
        queue.append(2);
        queue.append(3);
        queue.dequeue();
        queue.print();

    }
}