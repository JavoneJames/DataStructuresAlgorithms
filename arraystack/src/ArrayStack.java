public class ArrayStack<E> implements Stack<E> {

    private E[] arr;
    private int cursor;

    public ArrayStack() {
    }

    @Override
    public boolean isEmpty() {
        return cursor == -1;
    }

    @Override
    public void push(E x) {

    }

    @Override
    public void pop() {

    }

    @Override
    public E top() {
        return null;
    }
}
