class Node {

    int data;//store data to be added to the list
    Node next;//a reference to the next object

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

class ListException extends RuntimeException{

    public ListException(String s){
        super(s);
    }
}