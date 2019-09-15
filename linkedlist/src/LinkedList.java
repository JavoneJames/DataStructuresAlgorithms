public class LinkedList<E> {

    private Node <E>front;//object of the Node class
    //private Node back;

    private LinkedList()
    {
        front = null;//initialize the object to be null
        //back  = null;//initialize the object to be null
    }

    private void addToFront(E i)
    {

        front = new Node<E>(i, front);//creates a new object that adds to the front
    }

    private void addToBack(E i) {
        if (front == null)//checks if the front is null - if so creates a new object that adds to the front
            front = new Node<E>(i, null);

        Node<E> cell = front;//creates a copy object of the current linkedlist
        while (cell.next != null)//loops through the list whilst there items
            cell = cell.next;//temp store data in the current node and iterates to the next node
        cell.next = new Node<E>(i, null);//creates a new object that adds to the back

    }

    private int length()
    {
        Node<E> cell = front;//create an object copy of the current linkedlist
        int counter = 0;//to be used to count the length of the list
        while (cell != null) {//loops and counts which the is not empty
            counter++;
            cell = cell.next;
        }
        return counter;
    }

    private int occs(E i)//pass through the parameter what to look for in the list - could be different data types
    {
        Node<E> cell = front;
        int counter = 0;
        while (cell != null) {//loops through the linkedlist
            if (cell.data == i)//checks if the current element matches what is being looked for
                counter++;//if so then increments the counter
            cell = cell.next;//moves to the next reference point
        }
        return counter;
    }

    private void removeFront()
    {
        if (front == null)//if the front is null there's nothing to remove - throws exception
            throw new ListException("the list is empty");
        front = front.next;//replace the head node with the 'tail'
    }

    private void removeBack()
    {
        if (front == null)//checks if the front is empty - if it is then the object is empty
            throw new ListException("the list is empty");
        if (front.next == null)//if reference point is null then there's only one element in the list
            front = null;//deletes the element by making it null
        Node<E> cell = front;
        while(cell.next.next != null)//loops through the linkedlist - until it reaches the end
            cell = cell.next;
        cell.next = null;
    }

    private boolean removeFirstOccu(E i)
    {
        if (front == null)//checks if the list is empty
            throw new ListException("the list is empty");
        if (front.data == i)//checks if the first element matches what is being looked for
            front = front.next;
        Node<E> cell = front;
        while (cell.next != null && cell.next.data != i)//loops while not null and the next element is not what is being looked for
            cell = cell.next;
        if (cell.next == null)//checks if reference point is null
            throw new ListException("tried to remove " + i + " could not find it");
        else{
            cell.next = cell.next.next;
            return true;
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
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addToFront(1);
        ll.addToBack(2);
        ll.addToBack(3);
    }


}
