import java.util.Scanner;
public class guessgame{
    

    public static void main(String[] args) {
       
        Scanner in=new Scanner(System.in);   
        int number = in.nextInt();
       for(int i=1;i<=10;i++)
       {
           var ran = Math.floor(10 * Math.random());
           System.out.println(+ran);

          
       }
          
    }
}
