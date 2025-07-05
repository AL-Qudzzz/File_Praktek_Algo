public class StackArrayExample {
    private int maxSize;
    private int[] stackArray;
    private int top;

    // Constructor to initialize the stack
    public StackArrayExample(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1; // Indicates the stack is empty
    }

    // Push method to add an element to the stack
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + value);
            return;
        }
        stackArray[++top] = value;
        System.out.println(value + " pushed to stack");
    }

    // Pop method to remove and return the top element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop from an empty stack.");
            return -1;
        }
        int value = stackArray[top--];
        System.out.println(value + " popped from stack");
        return value;
    }

    // Peek method to view the top element without removing  it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Nothing to peek.");
            return -1;
        }
        return stackArray[top];
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return (top == -1);
    }

    // Check if the stack is full
    public boolean isFull() {
        return (top == maxSize - 1);
    }

    // Main method to demonstrate the stack operations
    public static void main(String[] args) {
        StackArrayExample stack = new StackArrayExample(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Top element is: " + stack.peek());
        stack.pop();
        stack.pop();
        stack.push(40);
        System.out.println("Top element is: " + stack.peek());
    }
}
