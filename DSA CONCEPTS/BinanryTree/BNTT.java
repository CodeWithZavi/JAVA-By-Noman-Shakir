class Bst {
    class Node {
        int data;
        Node left;
        Node right;
    }

    Node root = null;

    private Node insert(Node n, int value) {
        Node node = new Node();
        if (n == null) {
            node.data = value;
            return node;
        } else if (value < n.data) {
            n.left = insert(n.left, value);
        } else {
            n.right = insert(n.right, value);
        }
        return n;
    }

    public void insert(int value) {
        root = insert(root, value);
    }

    private Node search(Node n, int key) {
        if (n == null) {
            return null;
        }
        if (n.data == key) {
            return n;
        } else if (key < n.data) {
            return search(n.left, key);
        } else {
            return search(n.right, key);
        }
    }

    public boolean search(int key) {
        Node n = search(root, key);
        if (n != null) {
            return true;
        }
        return false;
    }

    private void preOrder(Node n) {
        if (n == null) {
            return;
        }
        System.out.print(n.data + " ");
        preOrder(n.left);
        preOrder(n.right);
    }

    public void traverse() {
        preOrder(root);
    }

    private Node delete(Node n, int key) {

        if (n != null) {
            n = null;
        } else {
            System.out.println("node is not present");
        }
        return n;
    }

}

public class BNTT {
    public static void main(String[] args) {
        Bst tree = new Bst();
        tree.insert(2);
        tree.insert(4);
        tree.insert(1);
        tree.insert(31);
        tree.traverse();

    }

}