public class AvailTree {

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(25);
        tree.insert(15);
        tree.insert(16);
        tree.insert(7);
        tree.insert(12);
        tree.insert(63);
        tree.insert(55);
        tree.insert(73);
        tree.insert(65);
        tree.insert(63);

        System.out.print("Pre-order traversal: ");
        tree.preOrder();
        System.out.println();

        // System.out.println("Delete 20");
        // tree.delete(20);
        // System.out.print("Pre-order traversal: ");
        // tree.preOrder();
        // System.out.println();

        // System.out.println("Delete 30");
        // tree.delete(30);
        // System.out.print("Pre-order traversal: ");
        // tree.preOrder();
        // System.out.println();

        // System.out.println("Delete 50");
        // tree.delete(50);
        // System.out.print("Pre-order traversal: ");
        // tree.preOrder();
        // System.out.println();

        // tree.insert(20);
        // tree.insert(10);
        // tree.insert(40);
        // tree.insert(2);
        // System.out.print("Pre-order traversal after new insertions: ");
        // tree.preOrder();
        // System.out.println();
    }
}

class BinarySearchTree {
    class Node {
        int data;
        Node left, right;

        public Node(int item) {
            data = item;
            left = right = null;
        }
    }

    Node root;

    BinarySearchTree() {
        root = null;
    }

    public Node insert(Node n, int value) {
        if (n == null) {
            return new Node(value);
        }
        if (value < n.data) {
            n.left = insert(n.left, value);
        } else {
            n.right = insert(n.right, value);
        }

        return Balance(n);
    }

    public void insert(int value) {
        root = insert(root, value);
    }

    public Node delete(Node n, int value) {
        if (n == null) {
            return n;
        }

        if (value < n.data) {
            n.left = delete(n.left, value);
        } else if (value > n.data) {
            n.right = delete(n.right, value);
        } else {
            if (n.left == null) {
                return n.right;
            } else if (n.right == null) {
                return n.left;
            }

            n.data = findSuccessor(n.right);
            n.right = delete(n.right, n.data);
        }

        return Balance(n);
    }

    public void delete(int value) {
        root = delete(root, value);
    }

    public int findSuccessor(Node n) {
        int minValue = n.data;
        while (n.left != null) {
            minValue = n.left.data;
            n = n.left;
        }
        return minValue;
    }

    public void preOrder(Node n) {
        if (n == null) {
            return;
        }

        System.out.print(n.data + " ");
        preOrder(n.left);

        preOrder(n.right);

    }

    public void preOrder() {
        preOrder(root);
    }

    public int height(Node n) {
        if (n == null) {
            return -1;
        } else {
            return Math.max(height(n.left), height(n.right)) + 1;
        }
    }

    public int balFac(Node n) {
        return height(n.left) - height(n.right);
    }

    public Node Balance(Node n) {
        int balanceFactor = balFac(n);
        if (balanceFactor > 1) {
            if (balFac(n.left) >= 0) {
                n = rotateRight(n);
            } else {
                n.left = rotateLeft(n.left);
                n = rotateRight(n);
            }
        } else if (balanceFactor < -1) {
            if (balFac(n.right) <= 0) {
                n = rotateLeft(n);
            } else {
                n.right = rotateRight(n.right);
                n = rotateLeft(n);
            }
        }
        return n;
    }

    public Node rotateRight(Node n) {
        Node newRoot = n.left;
        Node temp = newRoot.right;
        newRoot.right = n;
        n.left = temp;
        return newRoot;
    }

    public Node rotateLeft(Node n) {
        Node newRoot = n.right;
        Node temp = newRoot.left;
        newRoot.left = n;
        n.right = temp;
        return newRoot;
    }
}