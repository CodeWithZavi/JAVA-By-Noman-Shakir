/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ZAVIAN ~
 */
import java.util.Scanner;
public class MaxAndMin {
    
        public static void main(String[] args) {
            int arr[] = new int[5];
              Scanner in = new Scanner(System.in);
              for(int i=0;i<arr.length;i++)
              {
                   arr[i]= in.nextInt();
              }
              int large = 0;
              int small=0;
              int c=0;
              for(int i=0;i<arr.length;i++)
              {
                    if(arr[i]>large)
                    {
                         large = arr[i];
                    }
                    if(arr[i]<small||c==0)
                    {
                         small = arr[i];
                         c++;
                    }
              }
              System.out.println("Large number = "+large+" small = "+small);
    }
    
}
