
public class QueueArray{

    static class quArray {

        static int arr [];
        static int size;
        static int rear;
    
        quArray(int n)
        {
            arr = new int[n];  // give size to array
            size = n;
            rear = -1;  // -1 index pa ha 0 se phale 
        }
    
        public static boolean IsEmpty()
        {
             return rear==-1;  // when queue is empty
        }
        public static boolean isFull()
        {
              return rear == size-1;
        }
        
        public static void Add(int data)   // OR enque
        {
              if(isFull())
              {
                  System.out.println("queue is Full");
                  return;
              }
            
              rear = rear+1;  // shift forward
              arr[rear] = data;  // us place pa value
        }
        public static int Remove()   // dequeue
        {
             if(IsEmpty())
             {
                 System.out.println("queue is Empty");
                 return Integer.MIN_VALUE;  // or return -1
             }
    
             int front = arr[0];  // extract value from 0 index
    
            for(int i = 0 ; i<rear;i++)
            {
                 arr[i] = arr[i+1]; 
            }
             rear = rear-1;
             return front;
    
    
        }
        public static int peak()   // front
        {
            if(IsEmpty())
            {
                System.out.println("queue is Empty");
                return Integer.MIN_VALUE;  // or return -1
            }
            return arr[0];  //OR  front value
        }
    }

    public static void main(String[] args) {

        quArray q = new quArray(5);
        q.Add(2);
        q.Add(4);
        q.Add(6);

        while(!q.IsEmpty())
        {
             System.out.println(q.peak());
             q.Remove();
        }

      
        

    }
}


