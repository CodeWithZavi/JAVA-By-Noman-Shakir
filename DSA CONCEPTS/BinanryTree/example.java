class AVLTree{
    Node root;
 class Node {
     int data;
     Node left, right;

     public Node(int item) {
         data = item;
         left = right = null;
     }
 }
 public int height(Node n)
 {
     if(n==null){
         return -1;
     }
     else{
         return Math.max(height(n.left), height(n.right))+1;
     }
 }
 
 public int balancefactor(Node n)
 {
     return (height(n.left)-height(n.right));
 }
 public Node balance(Node n)
 {
     if(balancefactor(n)>1){
         if (balancefactor(n.left)>0)
         {
            rotateRight(n);
         }
         else{
             rotateLeft(n.left);
             rotateRight(n);
         }
         
     }
     else if(balancefactor(n)<-1)
     {
          if (balancefactor(n.right)<0)
         {
            rotateLeft(n);
         }
         else{
             rotateRight(n.right);
             rotateLeft(n);
         }
     }
     return n;
 }
 public Node rotateRight(Node n)
 {
     Node t1=n;
     Node t2=n.left.right;
     n=n.left;
     n.right=t1;
     n.right.left=t2;
     return n;
 }
    public Node rotateLeft(Node n)
 {
     Node t1=n;
     Node t2=n.right.left;
     n=n.right;
     n.left=t1;
     n.left.right=t2;
     return n;
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

     return balance(n);
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

     return balance(n);
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
}