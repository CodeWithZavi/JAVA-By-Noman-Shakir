
 class test {
    private static int count;
    
    public static int LargeNumber(int a,int b,int c)
    {
          if(a>b&&a>c)
          {
               return a;
          }
          else if(b>a&&b>c)
          {
               return b;
          }
          else {
               return c;
          }
    }
   public test()
   {
       count++;
   }
   public static int getCount()
   {
        return count;
   }
   public static int HCF(int n1,int n2)
   {
       int h = 1;
       int great = 0;
       
      // if(n1>n2)?(great=n1):(great=n2);
       if(n1>n2)
       {
            great = n1;
       }
       else {
             great = n2;
       }
       for(int i=1;i<=great;i++)
       {
           if(n1%i==0&&n2%i==0)
           {
                h= h*i;
           }
       }
       return h;
       
   }
   public static int PowerValue(int a,int b)
   {
        int power = (int)Math.pow(a, b);
        return (int) power;  
   }
      
}
public class Prac{
   
   public static void main(String[] args) {
       
      
       int n1 = 2,n2=5,n3=8;
       System.out.println("Largest number = "+test.LargeNumber(n1,n2,n3));
      new test();
       new test();
        new test();
        new test();
          System.out.println("Number of objects created are "+test.getCount());
           System.out.println("HCF of "+n1+" and "+n2+" = "+test.HCF(n1,n2));
           
           System.out.println("Power  = "+test.PowerValue(n2, n1));
        
   }
   
   
}