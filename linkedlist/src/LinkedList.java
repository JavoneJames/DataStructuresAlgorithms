public class LinkedList {

    private Node front;//object of the Node class

    public LinkedList()
    {
        front = null;//initialize the object to be null
    }

    private void addToFront(int i)
    {
        front = new Node(i, front);//creates a new object that adds to the front
    }

    private void addToBack(int i)
    {
        if (front == null){//checks if the front is null - if so creates a new object that adds to the front
            front = new Node(i, null);
        }else{
            Node cell = front;//creates object of the current linkedlist
            while (cell.next != null)//loops through the list whilst there items
                cell = cell.next;
            cell.next = new Node(i, null);
        }
    }


}
