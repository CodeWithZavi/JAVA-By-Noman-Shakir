import java.util.Scanner;
public class CallingThreeClasses {
    
      public static void main(String[] args) {
        
        System.out.println("enter the number to check even or not");
        Scanner in = new Scanner(System.in);
        int number  = in.nextInt();
         ONE c1 = new ONE();
         c1.print(number);
         System.out.println();
         System.out.println("enter the number to find it factorail");
         int number2 = in.nextInt();
         c1.c2.fac(number2);
         System.out.println();
         System.out.println("enter the number for printing triangle");
         int number3 = in.nextInt();
         c1.c2.c3.triangle(number3);
         System.out.println();
         System.out.println("enter the number for printing triangle");
         int number4 = in.nextInt();
         c1.c2.c3.c4.TRI(number4);

          
      }
}
 class ONE{
       
    void print(int number)
    {
          if(number%2==0)
          {
             System.out.println(number+" is even number");
          }
          else {
             System.out.println(number+" is odd number");
          }
    }
       two c2 = new two();
    
}
class two{
    void fac(int number2)
    {  int fac = 1;
         for(int i=1;i<=number2;i++)
         {
              fac = i*fac;
         }
         System.out.println();
         System.out.println("fac of "+number2+" = "+fac);
    }
       three c3 = new three();
}
class three{
     
   void triangle(int number3)
   {
      int s = number3/2;
      for(int i=1;i<=number3;i++)
      {
          for(int j=1;j<=i;j++)
          {
              System.out.printf("*");
          }
          System.out.printf("\n");
      }
   }
   four c4 = new four();
}
class four{


      void TRI(int number4)
      {
           for(int i=1;i<=number4;i++)
           {
              for(int j=number4;j>=i;j--)
              {
                System.out.print("+");
              }
              System.out.println();
           }

      }
}