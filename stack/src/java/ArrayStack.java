import java.util.ArrayList;

public class ArrayStack<T> implements Stack<T>{
    private T[] arr;
    private int cursor;
    private ArrayStack(){
        arr = (T[]) new Object[20];
        cursor = -1;
    }
    @Override
    public boolean isEmpty() {
        return cursor == -1;
    }
    @Override
    public boolean isFull() {
        return !isEmpty() && cursor == arr.length;
    }
    @Override
    public void push(T x) {
        cursor++;
        if (isFull()){
            T[] temp = (T[]) new Object[arr.length + 1];
            for (int i = 0; i < arr.length; i++)
                temp[i] = arr[i];
            arr = temp;
        }else{
            arr[cursor] = x;
        }
    }
    @Override
    public void pop() {
        if (isEmpty())
            throw new StackException("pop");
        arr[cursor] = null;
        cursor--;
    }
    @Override
    public T top() {
        if (isEmpty())
            throw new StackException("top");
        return arr[cursor - 1];
    }
}
