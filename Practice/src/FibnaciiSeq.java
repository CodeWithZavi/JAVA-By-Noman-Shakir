import java.util.Scanner;
public class FibnaciiSeq 
{
     
      public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
           int number = in.nextInt();
           fib call = new fib();
           System.out.println("feb seq of "+number+" = "+call.Fib(number)); 
      }   
}
 class fib
 {  
       public int Fib(int number)
       {
        // first make a base case
         if(number==0)
      {
           return 0;
      }

      if(number==1)
      {
         return 1;
      }
     // as we know fibb is the sum of previous two terms
      int  first = Fib(number-1);  
      int sec = Fib(number-2);
      int Fibnacii = first+sec;

      return Fibnacii;
       }
      
 }