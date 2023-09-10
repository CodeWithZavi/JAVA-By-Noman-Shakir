import java.util.Scanner;

public class array{

    public static void main(String[] args) {
        int[] arr = new int[5]; // Initialize the array with a size of 5
        System.out.println("Enter 5 integers:");

        Scanner s = new Scanner(System.in);
        
        // Input array elements
        for (int i = 0; i < 5; i++) {
            arr[i] = s.nextInt();
        }

        // Print the array elements
        System.out.println("Array is:");
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
}
