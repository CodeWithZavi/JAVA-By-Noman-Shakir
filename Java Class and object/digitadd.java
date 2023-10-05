import java.util.Scanner;
public class digitadd {
    
    public static void main(String[] args) {
        
          
             Scanner in = new Scanner(System.in);
              System.out.println("enter the number");
             int num = in.nextInt();
             int last = num%10; // extract last one
             int d = 0;
             while(num>0)
{               d = num%10;
                 num = num/10;
             }
             int sum = last+d;
             System.out.printf("sum  = %d ",sum);
             
                  
                 

             
    }
     
}
