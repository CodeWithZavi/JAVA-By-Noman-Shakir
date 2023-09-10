public class prime {
    
     public static void main(String[] args) {
        
        int number = 7;
        int divisor=0;
        for(int i=2;i<=number/2;i++)
        {
             if(number%i==0)
             {
                 divisor++;
             }
        }
        if(divisor==0)
        {
             System.out.println(number+" is prime number");
        }
        else {
             System.out.println(number+" is not prime number");
        }
        
     }
}
