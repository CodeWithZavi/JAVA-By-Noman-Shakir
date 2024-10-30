import java.util.*;
public class queueCon {
    

    public static void main(String[] args) {
        
            Queue <String> queue = new LinkedList<String>(); // cos queue ak interface ha we cant make it intacne

            System.out.println(queue.isEmpty());
            queue.offer("Nooman");
            queue.offer("ali");
            queue.offer("siraj");
            queue.offer("asim");

          //  System.out.println(queue.isEmpty());
          System.out.println(queue);
          System.out.println("size before pulling = " +queue.size());

          queue.remove("ali");
          System.out.println(queue);
          System.out.println("aize after polling = " +queue.size());

          System.out.println("sab se 1st item = "+queue.peek());
    }
}
