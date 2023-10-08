/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ZAVIAN ~
 */
import java.util.Scanner;
public class ArrayIsSortedOrNot {
    
    public static void main(String[] args) {
        
         Scanner in  = new Scanner(System.in);
         System.out.println("Enter length of array");
         int l = in.nextInt();
        int  arr[] = new int[l]; 
          int c=0;
        System.out.println("Enter an Array");
         for(int i=0;i<arr.length;i++)
         {
              arr[i] = in.nextInt();
         }
           boolean issort = true;
          for(int i=0;i<arr.length-1;i++)
          {
               if(arr[i]>arr[i+1])
               {
                    issort = false;
                    break;
               } 
    }
          if(issort)
          {
               System.out.println("Array is sorted");
          }
          else
          {
             for(int i=0;i<arr.length;i++)
                {
                     for(int j=i;j<arr.length;j++)
                     {
                         if(arr[i]>arr[j])  //12351
                         {
                            int temp = arr[i];
                            arr[i] = arr[j];
                            arr[j] = temp;

                         }
                     }
                }
              System.out.println("Now after sorting Array = ");
          for(int i=0;i<arr.length;i++)
          {
                System.out.println(arr[i]);
          }
          }
         
          
          }
          
    
}

