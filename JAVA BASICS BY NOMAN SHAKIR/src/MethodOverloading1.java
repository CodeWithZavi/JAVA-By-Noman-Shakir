
class method{

    static void Name()
    {
          System.out.println("Noman shakir");
    }
    static void Name(String a)
    {
          System.out.println("Hello "+a);
    }

   // static int Name(String a) {   You cant create this }

   static int Name(int a,int b)
   {
      return a+b;
   }

}
public class MethodOverloading1{
    

    public static void main(String[] args) {
        
        method.Name();
        method.Name("BAHI JAAN");
        int sum = method.Name(12, 32);
        System.out.println("sum = "+sum);


    }
}
