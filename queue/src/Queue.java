public interface Queue<T> {
    boolean isEmpty();
    void enqueue(T x);
    int dequeue();
    T front();
}