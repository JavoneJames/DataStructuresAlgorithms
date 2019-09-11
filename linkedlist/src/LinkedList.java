public class LinkedList {

    private Node front;//object of the Node class
    //private Node back;

    private LinkedList()
    {
        front = null;//initialize the object to be null
        //back  = null;//initialize the object to be null
    }

    private void addToFront(int i)
    {
        front = new Node(i, front);//creates a new object that adds to the front
    }

    private void addToBack(int i)
    {
        if (front == null)//checks if the front is null - if so creates a new object that adds to the front
            front = new Node(i, null);
        else{
            Node cell = front;//creates a copy object of the current linkedlist
            while (cell.next != null)//loops through the list whilst there items
                cell = cell.next;
            cell.next = new Node(i, null);//creates a new object that adds to the back
        }
    }

    //The code below can be used if frequent calls to the addToBack method is expected
    //This is because it is more efficient to store a reference to the last item in the list
    /*private void addToFront(int i)
    {
        front = new Node(i, front);
        if (back == null)
            back = front;
    }

    private void addToBack(int i)
    {
        if (front == null)
            front = back = new Node(i, null);
        else{
            back.next = new Node(i, null);
            back = back.next;
        }
    }*/

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addToFront(1);
        ll.addToBack(2);
        ll.addToBack(3);
    }


}
