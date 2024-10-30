import java.util.*;

public class standardQueueMain{
    

     public static void main(String[] args) {
    
      standardQueue cal = new standardQueue();
      cal.display();
         

     }
}
class standardQueue{


   public void display()
   {
      Queue <Double> queue = new LinkedList<>();
             
      System.out.println("before prioritu queie all are not in order");
      queue.offer(10.2);
      queue.offer(12.3);
      queue.offer(2.3);

      while (!queue.isEmpty()) {
         System.out.println(queue.poll()); // 1st wala phir uske peche wale print kare ga line wise
         
      }
   }

           //  the above code we do is for standard queue

}
