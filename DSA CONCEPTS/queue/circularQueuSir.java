public class circularQueuSir {
    
     
          class QueuArr<T> {
             
            
          T[] arr = (T[])new Object[5]; 
          int head =0;
          int tail = -1;

          public boolean IsEmpty()
          {
            return (tail<=-1);
          }
          public boolean isFull()
          {
             return tail>=arr.length-1;
          }
          
          public void enque (T value)
          {
              if(isFull())
              {
                  System.out.println("full");
              }
              else{
                  
                arr[++tail] = value;  // phale ++ kare ga then value lega
              }
          }
          public T dequeue()
          {
               if(IsEmpty())
               {
                 System.out.println("empty");
                 return null;
               }
               else {
                 
                return arr[head++]; // access value of head then ++ kar ka value retuen kar dega
               }

          }
          public int size ()
          {
             return (tail-head+1);
          }
          public T d()
          {
               if(IsEmpty())
               {
                 System.out.println("empty");
                 return null;
               }
               else {
                 
                return arr[head]; // access value of head then ++ kar ka value retuen kar dega
               }

          }
          
          

          }
          public static void main(String[] args) {
            
             
            QueuArr<Integer> q = new
            q.enque(3);
            q.enque(4);
            System.out.println(q.size());
            System.out.println(q.dequeue());
          }
     
}
