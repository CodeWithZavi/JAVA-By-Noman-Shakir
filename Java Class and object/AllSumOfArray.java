import java.util.Scanner;

public class AllSumOfArray {
    
     public static void main(String[] args) {
        
          Scanner in = new Scanner(System.in);
          System.out.println("enter array");
          int arr1[] = new int[5];
          for(int i=0;i<5;i++)
          {
             arr1[i] = in.nextInt();
          }
          System.out.println("enter the sum");
        int result = in.nextInt();
          for(int i=0;i<5;i++)
          {
             for(int j=1+i;j<5;j++)
             {
                  if(arr1[i]+arr1[j]==result)
                  {
                    System.out.println(" "+arr1[i]+" "+arr1[j]);
                  }
             }
          }


     }
}
