          // Number format Exception
public class TryAndCatch { 
   public static void main(String[] args) {
          try{
              int c = 12%0;  // yeh exception ha hamrea pass
              System.out.println("c = "+c);
          }catch(ArithmeticException n)  //
          {
             System.out.println("it cant be solve");
          }

          // Number format Exception
           String s = "nomn";
          try {
                 int a = Integer.parseInt(s);
                 System.out.println(a);

          }catch(NumberFormatException n){
              System.out.println("it cant be converted");
          }
          System.out.println("this is try and catch");
   }

}
