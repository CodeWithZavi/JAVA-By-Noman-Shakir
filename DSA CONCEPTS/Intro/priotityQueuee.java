import java.util.Queue;
import java.util.Collections;
import java.util.PriorityQueue;;
public class priotityQueuee {
    

    public static void main(String[] args) {
        
           Queue <Double> queue = new PriorityQueue<>();  // start ma gar prioty que ho phir bi hota ha 

           queue.offer(10.2);
           queue.offer(23.4);
           queue.offer(2.3);
 System.out.println("priority wise queue");
           while (!queue.isEmpty()) {
               System.out.println(queue.poll());
            
           }
           Reverse cal = new Reverse();
           cal.Re();
    }
}
 class Reverse {

    public void Re()
    {
        Queue <Double> queue = new PriorityQueue<>(Collections.reverseOrder());  // start ma gar prioty que ho phir bi hota ha 

        queue.offer(1.0);
        queue.offer(2.0);
        queue.offer(3.0);

        System.out.println("After reversing of 1 - 2 - 3");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
         
        }
    }

}
