

public class BinarySearchTree {
    private Node<Integer> root;

    private BinarySearchTree() {
        root = null;
    }

    private boolean find(Integer integer) {
        Node<Integer> temp = root;
        boolean found = false;
        while (temp != null && !found) {
            int compareData = integer.compareTo(temp.data);
            if (compareData == 0) found = true;
            else if (compareData < 0) temp = temp.left;
            else temp = temp.right;
        }
        return found;
    }

    private boolean insert(Integer integer) {
        Node<Integer> parent = null;
        Node<Integer> temp = root;
        boolean left = false;
        while (temp != null && integer.compareTo(temp.data) != 0) {
            parent = temp;
            if (integer.compareTo(temp.data) < 0) {
                temp = temp.left;
                left = true;
            } else {
                temp = temp.right;
                left = false;
            }
        }
        if (temp != null)
            return false;
        else {
            Node<Integer> leaf = new Node<>(integer);
            if (parent == null) root = leaf;
            else if (left) parent.left = leaf;
            else parent.right = leaf;
            return true;
        }
    }

}
