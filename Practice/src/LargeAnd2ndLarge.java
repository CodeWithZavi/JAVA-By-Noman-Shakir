/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ZAVIAN ~
 */
import java.util.Scanner;
public class LargeAnd2ndLarge {
    
        public static void main(String[] args) {
            int arr[] = new int[5];
              Scanner in = new Scanner(System.in);
              for(int i=0;i<arr.length;i++)
              {
                   arr[i]= in.nextInt();
              }
              int large = 0;
              int SecondLarge=0;
              int c=0;
              for(int i=0;i<arr.length;i++)
              {
                    if(arr[i]>large)
                    {
                         large = arr[i];
                    }
              }
              for(int i=0;i<arr.length;i++)
              {
                  if(arr[i]>SecondLarge&&arr[i]<large)
                    {
                         SecondLarge = arr[i];
                    }
              }
              System.out.println("Large number = "+large+" small = "+SecondLarge);
    }
    
}
