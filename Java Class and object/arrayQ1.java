import java.util.Scanner;
public class arrayQ1{

   public static void main(String[] args) {
    
     Scanner in = new Scanner(System.in);
     System.out.println("enter the size of an array");
      int number = in.nextInt();
      int arr[] = new int[number];
     System.out.println("enter an array");
      for(int i=0;i<number;i++)
      {
             arr[i] = in.nextInt();
      }
      System.out.println("enter the number you want to remove OR Drop");
      int n = in.nextInt();
      
      for(int i=0;i<number;i++)
      {
         if(arr[i]==n)
         {
             continue;
         }
         System.out.println("array is "+arr[i]);
      }
   }
}