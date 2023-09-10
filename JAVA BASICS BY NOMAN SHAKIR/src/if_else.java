import java.util.Scanner;

public class if_else{

     public static void main(String[] args) {
        

           int pass;
           System.out.println("enter the password");

           Scanner obj = new Scanner (System.in);

           pass = obj.nextInt();
           if(pass==123)
           {
             System.out.println("pass match");
           }
           else
           {
             System.out.println("not match");
           }
     }

}