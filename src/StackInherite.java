// File: StackInherite.java
// Derived from class List.
public class StackInherite extends List {
    // no-argument constructor
    public StackInherite() {
        super("stack");
    }

    // add object to stack
    public void push(Object object) {
        insertAtFront(object);
    }

    // remove object from stack
    public Object pop() throws EmptyListException {
        return removeFromFront();
    }
}
