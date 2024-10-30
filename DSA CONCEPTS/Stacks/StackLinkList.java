import java.util.Stack;

import org.w3c.dom.Node;

public class StackLinkList {

     static class Node {
          
          int data;
          Node next;

           Node(int data)
          {
               this.data= data;
               this.next=null;
             
          }
        }
         // now made a class for stack:
         static class Stack {
              
            static Node head = null;

            public static boolean isEmpty()
         {
              return head ==null;
         }

         public static void push(int data)
         {
             Node newnNode = new Node(data);
            if(isEmpty())
            {
                head = newnNode;
                return;
            }
            newnNode.next = head; 
            head = newnNode;  // shift back head to new node
         }
         public static int pop()
         {
              if(isEmpty())
              {
                  return -1;
              }
              int top = head.data; 
              head = head.next;
              return top;
         }
         public static int peak(){

                 if(isEmpty())
                 {
                    return -1;
                 }
                 return head.data;
         }

         
         }






    

     public static void main(String[] args) {
        Stack s = new Stack(); 
        s.push(1);
        s.push(2);
        s.push(4);
        s.push(10);

        while (!s.isEmpty())
        {
              System.out.println(s.peak());
              s.pop();
              
        }
      }
}
