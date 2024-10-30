public class StackUsingarray {
    
   static class Stack {

        int [] arr = new int[5];
        int top = -1;

        public boolean isEmpty()
        {
              return top == -1;
        }
       public boolean isFull()
       {
          return top == arr.length-1;
       }
        public void push(int data)
        {
             if(isFull())
             {
                  System.out.println("stack overflow");
                  return ;
             }

             top++;
             arr[top] = data;
        }

        public int pop()
        {
              if(isEmpty())
              {
                  System.out.println("Stack underflow");
                  return -1;
              }

              int val = arr[top];
              top--;
              return val;
        }
        public int peak ()
        {
             if(isEmpty())
             {
                 System.out.println("empty");
                 return -1;
             }
             return arr[top];  // value on the top of the array
        }

    }

    public static void main(String[] args) {
        

          Stack s = new Stack();
          s.push(12);
          s.push(1);
          s.push(23);

          while (!s.isEmpty()) {

            System.out.println(s.peak());
            s.pop();
            
          }


    }


}

