class Node<E> {

    E data;
    Node<E> next;
    Node<E> prev;

    Node(E data, Node<E> next, Node<E> prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}

class ListException extends RuntimeException{

    ListException(String s){super(s);}

}