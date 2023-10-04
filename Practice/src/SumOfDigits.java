import java.util.Scanner;
public class SumOfDigits {



    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("enter the number");
        int number = in.nextInt();
        System.out.println("the sum of digits are "+display(number));
    }

public  static int display(int number)
        {
            int sum =0;
            int digit = 0;
            while(number>0)
            {
                digit = number%10;
                sum = sum+digit;
                number =number/10;
                System.out.print(digit+"\t");
            }
            return sum;
        }
        }


