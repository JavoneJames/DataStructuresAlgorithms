
public class Node<T>{
    T data;
    Node<T> left;
    Node<T> right;
    Node(T i){
        data = i;
        left = null;
        right = null;
    }
    Node(T i, Node<T> left,  Node<T> right){
        data = i;
        this.left = left;
        this.right = right;
    }
}
