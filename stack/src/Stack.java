public interface Stack<E> {
    boolean isEmpty();
    void push(E x);
    void pop();
    E top();
}

class StackException extends RuntimeException {
    StackException(String s) {
        super("Attempted to apply " + s + " to empty stack");
    }
}
