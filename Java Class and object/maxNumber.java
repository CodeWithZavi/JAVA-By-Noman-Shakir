import java.util.Scanner;
public class maxNumber {
    

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("enter the size of array");
        int length = in.nextInt();
         int arr[] = new int[length];

         for(int i=0;i<length;i++)
         {
           System.out.println("enter array");
              arr[i] = in.nextInt();
         }

        int large = 0;
         for(int i=0;i<length;i++)
         {
             large = Math.max(large,arr[i]);
         }
         System.out.println("large = "+large);
        int secLarge = 0;

       for(int i=0;i<length;i++)
       {
          if(arr[i]<large&&arr[i]>secLarge)
          {
               secLarge = arr[i];
          }
       }
       System.out.println("2nd large = "+secLarge);
          
         
    }
}
