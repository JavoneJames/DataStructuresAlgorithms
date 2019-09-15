class Node {

    int data;
    Node next;
    Node prev;

    Node(int data, Node next, Node prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}

class ListException extends RuntimeException{

    ListException(String s){super(s);}

}