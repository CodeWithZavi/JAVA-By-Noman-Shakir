import java.util.Scanner;

public class switchStatement{
    public static void main(String[] args) {
        int a, b, c;
        int work;
        System.out.println("Enter any two numbers:");
        Scanner obj = new Scanner(System.in);
        a = obj.nextInt();
        b = obj.nextInt();

        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }
        System.out.println("Enter 1 for addition\nEnter 2 for subtraction\nEnter 3 for multiplication\nEnter 4 for division\n");
        work = obj.nextInt();

        switch (work) {
            case 1:
                c = a + b;
                System.out.println("a + b = " + c);
                break;
            case 2:
                c = a - b;
                System.out.println("a - b = " + c);
                break;
            case 3:
                c = a * b;
                System.out.println("a * b = " + c);
                break;
            case 4:
                if (b == 0) {
                    System.out.println("Cannot divide by zero.");
                } else {
                    c = a / b;
                    System.out.println("a / b = " + c);
                }
                break;
            default:
                System.out.println("Invalid input. Please enter a valid option (1-4).");
                break;
        }
    }
}
