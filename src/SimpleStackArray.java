public class SimpleStackArray {
    private int maxSize;
    private int[] stackArray;
    private int top;

    // Constructor to initialize the stack
    public SimpleStackArray(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1; // Indicates the stack is empty
    }

    // Push method to add an element to the stack
    public void push(int value) {
        if (top < maxSize - 1) {
            stackArray[++top] = value;
            System.out.println(value + " pushed to stack");
        } else {
            System.out.println("Stack is full. Cannot push " + value);
        }
    }

    // Pop method to remove and return the top element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;
        }
        return stackArray[top--];
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return (top == -1);
    }

    // Main method to demonstrate the stack operations
    public static void main(String[] args) {
        SimpleStackArray stack = new SimpleStackArray(3);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());
        stack.push(4);
        System.out.println("Popped: " + stack.pop());
    }
}
