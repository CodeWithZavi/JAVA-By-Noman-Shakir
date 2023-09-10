import java.util.Scanner;

public class if_else_if{
     
    public static void main(String[] args) {
    int grade;
    System.out.println("enter the grade");

    Scanner obj = new Scanner(System.in);

    grade = obj.nextInt();

    if(grade<=100&&grade>=80)
    {
         System.out.println("1st divsion");
    }
    else if (grade<80&&grade>=60)
    {
         System.out.println("2nd divsion");
    }
    else {
         System.out.println("3rd divsion");
    }

    }
}
