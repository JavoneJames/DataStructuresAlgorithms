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
        if (front.next == null){//if true then only one item in the list - delete that object
            front = null;
        }else {
            Node cell = front;
            while (cell.next.next != null) {//loops until reaching the last node
                cell = cell.next;//shifts between nodes in the list
            }
            cell.next = null;//last node is found and deleted
        }
    }



}
