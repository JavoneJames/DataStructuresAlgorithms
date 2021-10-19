public class BinaryTree<T> {
    private Node<T> root;
    private BinaryTree(){
        root = null;
    }
    private BinaryTree(T i, BinaryTree<T> left, BinaryTree<T> right){
        root = new Node<>(i, left.root, right.root);
    }
    private BinaryTree(Node<T> node){
        root = node;
    }
    private boolean isEmpty(){
        return root == null;
    }
    private T value(){
        if (!isEmpty())
            return root.data;
        else
            throw new RuntimeException("tree is empty");
    }
    private BinaryTree<T> leftChild(){
        if (!isEmpty())
            return new BinaryTree<>(root.left);
        else throw new RuntimeException("tree is empty");
    }
    private BinaryTree<T> rightChild(){
        if (!isEmpty())
            return new BinaryTree<>(root.right);
        else throw new RuntimeException("tree is empty");
    }
    private void printInOrder(BinaryTree<T> tree){
        if (!tree.isEmpty()){
            printInOrder(tree.leftChild());
            System.out.println(tree.value());
            printInOrder(tree.rightChild());
        }
    }
    /*@Override
    public String toString() {
        return "BinaryTree{"
                + "left=" + leftChild()
                + "root=" + value()
                + "right=" + rightChild()
                + '}';
    }*/
    public String toString(){
       return getString(root);
    }
    private String getString(Node<T> node){
        String s1 = getString(node.left);
        String s2 = getString(node.right);
        return s1 + " " + node.data + " " + s2;
    }

    public static void main(String[] args) {

    }
}
