public interface Stack<T> {
    boolean isEmpty();
    boolean isFull();
    void push(T x);
    void pop();
    T top();
}

class StackException extends RuntimeException {
    StackException(String s) {
        super("Attempted to apply " + s + " to empty stack");
    }
}
