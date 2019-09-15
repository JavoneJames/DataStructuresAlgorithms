public class ArrayStack<E> implements Stack<E> {

    private E[] arr;
    private int cursor;

    private ArrayStack()
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
        cursor++;
        if (cursor == arr.length){
            E[] temp = (E[])new Object[arr.length + 1];
            for (int i = 0; i < arr.length; i++)
                temp[i] = arr[i];
            arr = temp;
        }
        arr[cursor] = x;
    }

    @Override
    public void pop() {
        if (cursor == -1)
            throw new StackException("pop");
        arr[cursor] = null;
        cursor--;
    }

    @Override
    public E top() {
        if (cursor == -1)
            throw new StackException("top");
        return arr[cursor];
    }


}
