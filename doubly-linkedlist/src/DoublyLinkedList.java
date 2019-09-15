public class DoublyLinkedList {

    private Node front;

    private DoublyLinkedList(){
        front = null;
    }

    private void addToFront(int i)
    {
        front = new Node(i, front, null);
    }

    private void addToBack(int i)
    {
        if (front == null)//checks if the front is null
          front = new Node(i, front, null);//creates a new object and adds to the front
        else{
            Node cell = front;
            while (cell.next != null)//loops through list
                cell = cell.next;//change to the next node
            cell.next = new Node(i, null, cell);//create a new object, adds element,
            // next is null and prev points to prev head
        }
    }

}
