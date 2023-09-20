import java.util.Scanner;

public class Prime {

    int Check(int number) {
        if (number <= 1) {
            return 0; // Not prime
        }
        for (int i = 2; i <= number/2; i++) {
            if (number % i == 0) {
                return 0; // Not prime
            }
        }
        return 1; // Prime
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        Prime obj = new Prime();
        int ch = obj.Check(num);

        if (ch == 1) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }

        input.close(); // Close the scanner
    }
}
