public class DoublyLinkedList<T> {

    private Node<T> front;
    private Node<T> back;

    private DoublyLinkedList(){
        front = null;
        //back = null;
    }
    private void addToFront(T i){
        front = new Node<>(null, i, front);
        if (front.next != null)
            front.next.prev = front;
        if (isEmpty()) back = front;
    }
    private void addToBack(T i){
        if (front == null) addToFront(i);
        else{
            back.next = new Node<>(back, i, null);
            back = back.next;
        }
    }
    private boolean isEmpty(){
        return front == null || back == null;
    }

}
