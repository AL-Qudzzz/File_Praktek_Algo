public class StackInheriteTest {
    public static void main(String[] args) {
        StackInherite stack = new StackInherite();

        // use push method
        stack.push(-1);
        stack.print();
        stack.push(0);
        stack.print();
        stack.push(1);
        stack.print();
        stack.push(5);
        stack.print();

        // remove items from stack
        try {
             
            Object removedObject = null;

            while (true) {
                removedObject = stack.pop(); // use pop method
                System.out.printf("%s popped\n", removedObject);
                stack.print();
            }
        } catch (EmptyListException emptyListException) {
            emptyListException.printStackTrace();
        }
    }
}
