public class DoublyLinkedList {

    private Node front;

    DoublyLinkedList(){
        front = null;
    }

    private void addToFront(int i)
    {
        front = new Node(i, front, null);
    }


}
