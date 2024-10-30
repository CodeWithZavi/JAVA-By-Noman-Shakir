public class DoublyLL {
    
     class Node {

          int data;
          Node next;
          Node prev;

         public Node(int data){

                this.data=data;
                this.next=null;
                this.prev=null;
         }

     }
     public static Node head;
     public static Node tail;
     public static int size;

     public void addFisrt(int data)
     {
        Node newNode = new Node(data);
        size++;
        if(head==null)  // or size ==0
        {
             head = tail = newNode;
             return;

        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;   
     }
     public void addLast(int data)
     {
          Node newNode = new Node(data);
          size++;

          if(head==null)
          {
              head = tail = newNode;
              return;
          }
          newNode.prev = tail;
          tail.next = newNode;
          tail = newNode;
     }
     public int removeFirst ()
     {
          if(head==null)
          {
              System.out.println("doubly link list is emplty");
              return Integer.MIN_VALUE;
          }
          if(size==1)
          {
             int val = head.data;
             head = tail = null;
             size=0;
             return val;
          }

     // if more them one 
     int val = head.data;
     head = head.next;
     head.prev=null;  // only in doubly
        size--;
        return val;
         
     }
     public int removeLast()
     {
         if(head==null)
         {
             System.out.println("link list is empty");
             return Integer.MIN_VALUE;
         }
         // if one 
         if(size==1)
         {
            int val = head.data;
              head = tail = null;
              size=0;
              return val;
         }
         // if more
         int val = tail.data;
         tail = tail.prev;
         tail.next=null;
         size--;
         return val;
     }
     public void print()
     {
         Node temp = head;
         while(temp != null)
         {
             System.out.print(temp.data+"  --> ");
             temp = temp.next;
         }
         System.out.print(" null");

     }
     public static void main(String[] args) {

        DoublyLL dll = new DoublyLL();
        dll.addFisrt(2);
        dll.addFisrt(4);
        dll.addFisrt(33);
        dll.addLast(10);
        dll.addLast(12);
        dll.addLast(21);
        dll.print();
        System.out.println("after removing : ");
        System.out.println("remove value from 1st = "+dll.removeFirst());
        System.out.println("remove value from last = "+dll.removeLast());
        dll.print();
        System.out.println();
        System.out.println("size = "+size);

     }
}
