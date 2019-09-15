public class DoublyLinkedList {

    private Node front;

    private DoublyLinkedList(){
        front = null;
    }

    private void addToFront(int i)
    {
        if (front != null) {
            front = new Node(i, front, null);
            front.next.prev = front;
        }else
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

    private void removeFront()
    {
        if (front == null)
            throw new ListException("the list is empty");
        front = front.next;//replace the front node with the node after it - to delete it
        front.prev = null;//prev becomes null - since front node doesnt have no node before it
    }

    private void removeBack()
    {
        if (front == null)
            throw new ListException("the list is empty");
        if (front.next == null){
            front = null;
        }else {
            Node cell = front;
            while (cell.next.next != null) {
                cell = cell.next;
            }
            cell.next = null;
        }
    }

    private void display()
    {
        Node cell = front;
        while (cell != null) {
            System.out.println(cell.data);
            cell = cell.next;
        }
    }

    public static void main(String[] args)
    {
        DoublyLinkedList dll = new DoublyLinkedList();
       dll.addToFront(2);
       dll.addToFront(1);
       dll.addToBack(3);
       dll.addToBack(4);
       dll.display();
       dll.removeFront();
       dll.display();
        dll.removeFront();
        dll.display();
    }

}
