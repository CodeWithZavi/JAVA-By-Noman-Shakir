class BinaryTree {

    class Node {

        int data;
        Node left;
        Node right;

    }

    Node root;

    private Node insert(Node n, int value) {
        if (root == null) {
            Node newNode = new Node();
            newNode.data = value;
            root = newNode;
        } else {
            System.out.println("already present");
        }
        return n;
    }

    private Node delete(Node n, int key) {
        if (n != null) {
            n = null;
        } else {
            System.out.println("node is not present");
        }
        return n;
    }

    private Node search(Node n, int key) {
        if (n == null) {
            return null;
        } else {
            if (n.data == key) {
                return n;
            }
            Node t = search(n.left, key);
            if (t == null) {
                t = search(n.right, key);
            }
            return t;
        }
    }

    public void preOrder(Node n) {
        if (n == null) {
            return;
        } else {
            System.out.print(n.data + " ");
            preOrder(n.left);
            preOrder(n.right);
        }
    }

    public void insert(int value) {
        root = insert(root, value);
    }

    public void delete(int key) {
        root = delete(root, key);
    }

    public boolean search(int key) {
        Node n = search(root, key);
        if (n != null) {
            return true;
        }
        return false;
    }

    public void traverse() {
        preOrder(root);
    }

    private Node findSucc(Node n) {
        while (n.left != null) {
            n = n.right;
        }
        return n;
    }
}

public class BinarySearchTree {

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.insert('A'); // Level 0
        bt.insert('B'); // Level 1
        bt.insert('C'); // Level 1
        bt.insert('D'); // Level 2
        bt.insert('E'); // Level 2
        bt.insert('F'); // Level 2
        bt.insert('G'); // Level 3
        bt.insert('H'); // Level 3
        bt.insert('I'); // Level 3

        bt.traverse();
    }
}