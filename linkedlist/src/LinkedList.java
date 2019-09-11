public class LinkedList {

    private Node front;

    public LinkedList()
    {
        front = null;
    }

    private void addToFront(int i)
    {
        front = new Node(i, front);
    }
}
