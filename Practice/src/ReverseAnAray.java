/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ZAVIAN ~
 */
import java.util.Scanner;
public class ReverseAnAray {
    
      public static void main(String[] args) {
        
         Scanner in = new Scanner(System.in);
           int arr[] = new int[5];
           
           for(int i=0;i<arr.length;i++)
           {
                arr[i] = in.nextInt(); 
           }
           int n = arr.length;
           for(int j=0;j<arr.length/2;j++)
           {
                int temp = arr[j];
                arr[j] = arr[n-j-1];
                arr[n-j-1] = temp;
     
           }
           System.out.println("Reverse of an Array is");
           for(int i=0;i<arr.length;i++)
           {
                System.out.println(+arr[i]);
           }
           
    
}
}
