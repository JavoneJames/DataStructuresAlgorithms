public class ArrayStack<E> implements Stack<E> {

    private E[] arr;
    private int cursor;

    public ArrayStack()
    {
        arr = (E[]) new Object[20];
        cursor = -1;
    }

    @Override
    public boolean isEmpty()
    {
        return (cursor == -1);
    }

    @Override
    public void push(E x)
    {

    }

    @Override
    public void pop() {

    }

    @Override
    public E top() {
        if (cursor == -1)
            throw new StackException("top");
        return arr[cursor];
    }
}
