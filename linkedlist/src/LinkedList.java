public class LinkedList<T> {
    private Node<T> front;
    private Node<T> back;

    private LinkedList() {
        front = null;
        this.back = null; /*can be used to keep track of the back of the linkedlist
        - by implementing an alternative algorithm the time complexity can be improved from O(n) to 0(1)*/
    }
    private void addToFront(T i) {
        /*create a new object Node - pass the new element to the first param to be added as data
         * pass the previous head/front to the second param to link both Nodes together*/
        front = new Node<>(i, front);
        //if (isEmpty()) this.back = this.front; //used wih the addToBack method that keeps track of the last Node
    }
    private void addToBack(T i){
        if (isEmpty()) addToFront(i);
        Node<T> copy = front;
        while (copy.next != null)
            copy = copy.next;
        copy.next = new Node<>(i, null);
    }
    /*private void addToBack(T i) {
        if (front == null)
            addToFront(i);
        back.next = new Node<>(i, null);
        back = back.next;
    }*/
    private boolean isEmpty(){
        return front == null || back == null;
    }
    private int size(){
        if (isEmpty())
            throw new RuntimeException("This is an empty linkedlist");
        Node<T> copy = front;
        int counter = 0;
        while (copy.next != null){
            copy = copy.next;
            counter++;
        }
        return counter;
    }
    @Override
    public String toString() {
        return "LinkedList{" +
                "front=" + front +
                ", back=" + back +
                '}';
    }

    public static void main(String[] args) {
        var list = new LinkedList<>();
        list.addToFront(2);
        list.addToFront(5);
        //list.addToBack(5);
        System.out.println(list.isEmpty());
    }
}
