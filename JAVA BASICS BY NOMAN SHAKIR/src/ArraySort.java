import java.util.Scanner;
import java.util.Arrays;
public class ArraySort{

    public static void main(String[] args) {
        int arr[] = new int[5];
        System.out.println("Enter 5 integers:");

        Scanner obj = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            arr[i] = obj.nextInt();
        }
        
        System.out.println("After sorting the Array:");
        Arrays.sort(arr); // it aoutomatic sort an array
        for (int d : arr) {
            System.out.print(d+" ");
        }
    }
}
