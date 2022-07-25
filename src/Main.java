public class Main {
    public static void main(String[] args) {
        Stack myStack = new Stack(5);
        System.out.println(myStack.isEmpty());
        System.out.println(myStack.isFull());
        myStack.push(3);
        myStack.push(2);
        myStack.push(1);
        myStack.printStack();
        myStack.pop();
        myStack.printStack();
    }
}

class Stack {
    private int[] arr;
    private int top;
    private int capacity;

    Stack(int size){
        arr = new int[size];
        top = -1;
        capacity = size;
    }
    public void push(int x){
        if(isFull()){
            System.out.println("stack full");
            System.exit(1);
        }
        top++;
        arr[top] = x;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("stack is empty");
            System.exit(1);
        }
        top--;
        return arr[top+1];
    }

    public int size(){
        return top + 1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == capacity -1;
    }
    public void printStack(){
        for(int i = 0; i <= top; i++){
            System.out.println(arr[i]);
        }
    }
}
