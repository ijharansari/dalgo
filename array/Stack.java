/* 
    -LIFO
    -create a method append to add element into stack
    -create a method pop to delete last elements from stack
    -get the size of the stack
*/

public class Stack{
    int arr [] = new int[5];
    int pointer = 0, size = 0;
    //assigning default value;
    Stack() {
        for(int a: arr) {
            a = 0;
        }
    }
    
    public void push(int data) {
        if(size>=arr.length) {
            System.out.println("Stack overflow");
            return;
        }
        arr[pointer] = data;
        size++;
        pointer++ ;
    }

    public void pop() {
        if(size == 0) {
            System.out.println("Stack is empty");
            return;
        }

        arr[pointer-1] = 0;
        size--;
        pointer--;
    }

    public int[] getStack() {
        if(size<=0){
            System.out.println("No elements in stack");
            //return empty stack
            return new int[]{};
        }

        // return entire original stack if its full
        if(size == arr.length) {
            return arr;
        }
        int tempArr[] = new int[size];
        
        for(int i=0; i< arr.length; i++) {
            if(arr[i] == 0) {
                break;
            }
            tempArr[i]=arr[i];
        }

        return tempArr;
    }

    public static void main(String... args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(3);
        stack.pop();
        stack.push(4);
        int [] arr = stack.getStack();
        for(int ar:arr) {
            System.out.println(ar);
        }
    }

}