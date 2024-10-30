//@ Noman:  
public class LinkListMain {
    static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void add(int data) {

        // create new node
        Node newNode = new Node(data);
        size++;

        // if no node is present
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // now new node = head
        newNode.next = head;

        // my head = my new node
        head = newNode;

    }

    public void addlast(int data) {
        Node newNode = new Node(data);
        size++;

        // specail case :
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // point tail next to new node
        tail.next = newNode;

        // new node ko tail bana do
        tail = newNode;
    }

    // For print
    public void Print() {

        if (head == null) {
            System.out.println("Link list is empty");
            return;

        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            // for update:
            temp = temp.next;

        }
        System.out.println(" null ");
    }
    
    public void MiddleAdd(int index ,int data)
    {
         if(index==0)
         {
             add(data);
             return;
         }
          Node newNode = new Node(data);
          size++;
          Node temp = head;
          int i =0;
          while(i<index-1)
          {
             temp = temp.next;
             i++;
          }
         // temp --> previcous node

         newNode.next = temp.next;
         temp.next = newNode;


    }

    public int removeFirst()
    {
         if(size==0)
         {
             System.out.println("link list is empty");
             return Integer.MIN_VALUE;
         }
         else if(size==1)  // mean one head and one tail
         {
              int value = head.data;
              head = tail = null;
              size=0;
              return value;
         }
          int value = head.data;
          head = head.next;
          size--;
          return value;
    }
public int removeLast()
{
      if(size==0)
      {
        System.out.println("link list is empty");
        return Integer.MIN_VALUE;
      }
      else if(size==1)
      {
          int value =  head.data;
          head = tail = null;
          size=0;
          return value;
      }
      Node prev = head;
      for(int i=0;i<size-2;i++)
    {
          prev = prev.next;
    }
     
    int value = prev.next.data;
    prev.next = null;
    tail = prev;
    size--;
    return value;
}
public int  itSearch(int key){

      Node temp = head;
      int index =0;
      while(temp!=null)
      {

           if(temp.data==key)  // key found
           {
              return index;
           }

           temp = temp.next;
           index++;
      }  
      return -1;  // key not founds
}
    public static void main(String[] args) {
        LinkListMain ll = new LinkListMain();
       
        ll.add(1);
        ll.add(10);
        ll.addlast(50);
     
        ll.add(2);
       
        ll.addlast(3);
     
        ll.addlast(4);
        ll.MiddleAdd(2, 12);
     //   ll.Print();
       //   System.out.println("size "+ll.size);
    //    ll.removeFirst();
       // ll.Print();
    //    System.out.println("size "+ll.size);
      // ll.removeLast();
       ll.Print();
    //    System.out.println("size "+ll.size);
      System.out.println("index = "+ll.itSearch(4));
    }

}