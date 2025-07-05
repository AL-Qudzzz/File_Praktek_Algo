// File: EmptyListException.java
// Exception class for empty list condition.

public class EmptyListException extends Exception {
    // no-argument constructor
    public EmptyListException() {
        this("List"); // call other EmptyListException constructor
    }

    // one-argument constructor
    public EmptyListException(String name) {
        super(name + " is empty"); // call superclass constructor
    }
}
