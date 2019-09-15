class Node <E>{

    E data;//store data to be added to the list
    Node<E> next;//a reference to the next object

    Node(E data, Node<E> next) {
        this.data = data;
        this.next = next;
    }
}

class ListException extends RuntimeException{

    public ListException(String s){
        super(s);
    }
}