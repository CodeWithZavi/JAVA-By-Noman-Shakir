public class stackArryGerneric {
    
    static class Stack<T> {
 
         Object[] arr = new Object[5];
         int top = -1;
 
         public boolean isEmpty() {
               return top == -1;
         }
        
         public boolean isFull() {
           return top == arr.length - 1;
         }
         
         public void push(T data) {
             if(isFull()) {
                 System.out.println("Stack overflow");
                 return ;
             }
 
             top++;
             arr[top] = data;
         }
 
         @SuppressWarnings("unchecked")
         public T pop() {
               if(isEmpty()) {
                   System.out.println("Stack underflow");
                   return null;
               }
 
               T val = (T) arr[top];
               top--;
               return val;
         }
         
         @SuppressWarnings("unchecked")
         public T peek() {
              if(isEmpty()) {
                  System.out.println("Stack is empty");
                  return null;
              }
              return (T) arr[top];  // value on the top of the array
         }
     }
 
     public static void main(String[] args) {
         Stack<Integer> s = new Stack<>();
         s.push(12);
         s.push(1);
         s.push(23);
 
         while (!s.isEmpty()) {
             System.out.println(s.peek());
             s.pop();
         }
     }
 }
 