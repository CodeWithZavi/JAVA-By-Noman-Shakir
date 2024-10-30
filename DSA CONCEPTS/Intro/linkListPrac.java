import java.util.LinkedList;
 /* IN link list store node in two parts ( Data + address ) 
  * Node are non cunsuctive memory location
  Elements are linked together Using ppinters

  // Advatage of link list
    Dynamic Data Structure ( allocate memory when needeed)
    insert and delete of node is easy
    no waste of memoty

    // Disadvante 
    large memory requirment
    no random access
    searching of element id difficult

    Uses
    1. Stacks
    2. Queue
    Gps navigations
    music playlist
 */
public class linkListPrac {
   
    public static void main(String[] args) {

        LinkedList <String> list = new LinkedList<>();
        list.push("A");
          list.push("B");
          list.push("C");
          list.push("D");
          list.push("E");

          list.add(4,"F");
          System.out.println();
          System.out.println("Linked List: "+list);
          System.out.println();
          list.remove("F");

          System.out.println("Linked List: "+list);

          System.out.println("1st peak ="+list.peekFirst());
          System.out.println("2nd peak ="+list.peekLast());

          linkListPop cal = new linkListPop();
          linkListOffer cal2 = new linkListOffer();
          cal.Display();
          cal2.Disp();

    }
}
class linkListPop {
     // u can use link list as a Stack
    public void Display()
    {
          LinkedList <String> list = new LinkedList<>();
          list.push("A");
          list.push("B");
          list.push("C");
          list.push("D");
          list.push("E");
          System.out.println();
    System.out.println("link list pop");
          System.out.println();
          System.out.println("Linked List: "+list);
          System.out.println();
          System.out.println("after pull"); // E top pa para va remove ho jae ga
          System.out.println("PUll: "+list.pop());
         
    }
}
class linkListOffer {

      // u can use link list as a queue
    public void Disp()
    {
         LinkedList <String> list = new LinkedList<>();
         list.offer("A");
         list.offer("B");
         list.offer("C");
         list.offer("D");
         list.offer("E");

         System.out.println();
         System.out.println("Linked List: "+list);
         System.out.println();
         System.out.println("after pop");
         System.out.println("PUll: "+list.poll());
         
    }
}