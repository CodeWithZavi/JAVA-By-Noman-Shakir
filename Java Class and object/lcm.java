import java.util.Scanner;
public class lcm {
    
    public static void main(String[] args) {
        
          Scanner in = new Scanner(System.in);

          System.out.println("enter two numbers");
          int n1  = in.nextInt();
          int n2 = in.nextInt();
          int g=0;
          int hcf = 1;
         if(n1>n2){
             g = n1;
         }
         else {
            g =n2;
         }
         for(int i=1;i<g;i++)
         {
              if(n1%i==0&&n2%i==0)
              {
                 hcf = hcf*i;
              }
         }
         int LCM  = lcm(n1,n2,hcf);
         System.out.printf("LCM of %d and %d = %d ",n1,n2,LCM);

    }

    public static int lcm(int num1,int num2,int gcd)
    {
         return (num1*num2)/gcd;
    }
}
