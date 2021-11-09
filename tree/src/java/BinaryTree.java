public class BinaryTree<T> {
  private Node<T> root;

  private BinaryTree() {
    root = null;
  }

  private BinaryTree(T i, BinaryTree<T> left, BinaryTree<T> right) {
    root = new Node<>(i, left.root, right.root);
  }

  private BinaryTree(Node<T> node) {
    root = node;
  }

  private boolean isEmpty() {
    return root == null;
  }

  private T value() {
    if (!isEmpty())
      return root.data;
    else
      throw new RuntimeException("tree is empty");
  }

  private BinaryTree<T> leftChild() {
    if (isEmpty())
      throw new RuntimeException("tree is empty");
    else
      return new BinaryTree<>(root.left);

  }

  private BinaryTree<T> rightChild() {
    if (isEmpty())
      throw new RuntimeException("tree is empty");
    else
      return new BinaryTree<>(root.right);

  }

  private void printInOrder(BinaryTree<T> tree) {
    if (!tree.isEmpty()) {
      printInOrder(tree.leftChild());
      System.out.println(tree.value());
      printInOrder(tree.rightChild());
    }
  }
}
