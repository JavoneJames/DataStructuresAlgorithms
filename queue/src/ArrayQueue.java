public class ArrayQueue<T> implements Queue<T> {

    private T[] arr;
    private int frontCursor;
    private int backCursor;

    private ArrayQueue() {
        arr = (T[]) new Object[2];
        frontCursor = 0;
        backCursor = -1;
    }

    @Override
    public boolean isEmpty() {
        return frontCursor == (backCursor + 1) % arr.length;
    }

    @Override
    public void enqueue(T x) {
        backCursor++;
        arr[backCursor] = x;
        if(isEmpty()){
            T[] temp = (T[]) new Object[arr.length + 1];
            int i;
            for (i = 0; i < arr.length; i++)
                temp[i] = arr[frontCursor + i];
            arr = temp;
            frontCursor = 0;
            backCursor = i - 1;
        }
    }

    @Override
    public int dequeue() {
        if (isEmpty()) throw new RuntimeException("empty queue");
        return frontCursor = (frontCursor + 1) % arr.length;
    }

    @Override
    public T front() {
        if (isEmpty()) throw new RuntimeException("empty queue");
        return arr[frontCursor];
    }

    public static void main(String[] args) {

    }
}
