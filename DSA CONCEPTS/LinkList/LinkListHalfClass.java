import org.w3c.dom.Node;

public class LinkListHalfClass {

   static class Node{

        int data;
        Node next;

        Node(int data)
        {
             this.data = data;
             this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size ;

    public void addfirst(int data)
    {
        Node newNode = new Node(data);
        size++;
        if(head==null)
        {
            head = tail = newNode;
            return;
        }

         
          newNode.next=head;
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

    tail.next = newNode;
    tail = newNode;

}
public void Print()
{
    if(head==null)
    {
         head = tail = null;
         return;
    }
     Node temp = head;
     while(temp!=null)
     {
          System.out.print(temp.data +" --> ");
          temp = temp.next;
     }
     System.out.println("null");
}
public int isSearch(int key)
{
       Node temp = head;
       int i=0;

       while(temp!=null)
       {
            if(temp.data==key)
            {
                return i;
            }

            temp = temp.next;
            i++;

       }
       return -1;
}

public int remove()
{
       if(size==0)
       {
          System.out.println("link list is empty");
          return Integer.MIN_VALUE;

       }
       if(size==1)
       {
             int value = head.data;
             head = head.next;
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
     if(size==1)
     {
          int value =  head.data;
          head = tail = null;
          size=0;
          return value;
     }

       Node prev = head;  
       // n-2 --> prev of last
       for(int i=0;i<size-2;i++)
       {
           prev = prev.next;
       }
       int value = prev.data;
       prev.next=null;
       tail = prev;
       size--;
       return value;



}

    
    public static void main(String[] args) {

        LinkListHalfClass ll = new LinkListHalfClass();
        ll.addfirst(2);
        ll.addfirst(1);

        ll.addLast(4);
        ll.addLast(5);

        ll.Print();
       
        System.out.println("index that tou are finding : "+ll.isSearch(5));
        System.out.println();
        ll.remove();
        ll.removeLast();
        ll.Print();


        

    }
}
