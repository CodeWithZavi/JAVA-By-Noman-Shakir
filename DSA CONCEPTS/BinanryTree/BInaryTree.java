public class BinaryTree<T> {

    class Node {
        T data;
        Node left;
        Node right;

        public Node(T data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    Node root;

    public void insertRoot(T data) {
        if (root == null) {

            root = new Node(data); // Node n = new Node()
            // n.data = value;
            // root = n;

        } else {
            System.out.println("root already inserted");
        }
    }

    public Node serach(Node n, T key) {
        if (n == null) {
            return null;
        } else {

            if (n.data == key)

                return n;
            Node t = serach(n.left, key);
            if (t == null) {
                t = serach(n.right, key);
                return t;

            }
        }
        return null;

    }

    public void insertRootLeft(T value, T key) // without serching key
    {
        Node t = serach(root, key);

    }

    public void insertRootRight(Node n, T data) {
        if (n != null && n.right == null) {
            n.right = new Node(data);

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

    public void inOrder(Node n) {
        if (n == null) {
            return;
        } else {
            inOrder(n.left);
            System.out.print(n.data + " ");
            inOrder(n.right);

        }
    }

    public void postOrder(Node n) {
        if (n == null) {
            return;
        } else {
            postOrder(n.left);
            postOrder(n.right);
            System.out.print(n.data + " ");

        }
    }

}
