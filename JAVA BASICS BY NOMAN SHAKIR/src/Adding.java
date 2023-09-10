import java.util.Scanner;

public class Adding {
    public static void main(String[] args) {
        
        int a,b,c;
        System.out.println("enter any two numbers");

        //for input 
        Scanner s = new Scanner(System.in);//
        a = s.nextInt();// for int value;
        b = s.nextInt();

        c = a+b;
        System.out.println("Sum of two numbers = "+c);

    }
}