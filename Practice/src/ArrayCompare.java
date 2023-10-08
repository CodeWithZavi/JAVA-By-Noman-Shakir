/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ZAVIAN ~
 */
public class ArrayCompare {
    
      public static void main(String[] args) {
        
           int arr[] = {1,4,5,2,4,43,1,4,5,1,5,5,3};
          
           for(int i=0;i<arr.length;i++)
           {
                 for(int j=i+1;j<arr.length;j++)
                 {
                      if(arr[i]==arr[j]&&i!=j)
                      {
                           System.out.println("Array is "+arr[i]);
                      }
                 }
           } 
    }
}
