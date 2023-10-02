import java.util.Scanner;
public class arr2 {
    

    public static void main(String[] args) {
        
        System.out.println("enter size of ann array");

        Scanner in = new Scanner(System.in);

        int size  = in.nextInt();

        int arr[] = new int[size];

        for(int i=0;i<size;i++)
        {
            arr[i] = in.nextInt();   //{1,4,5,6,7,7}
        }
        int length = arr.length;



    }
}
