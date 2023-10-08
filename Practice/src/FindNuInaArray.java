/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ZAVIAN ~
 */
import java.util.Scanner;
public class FindNuInaArray {
    
    
    public static void main(String[] args) {
        
         Scanner in = new Scanner(System.in);
           int arr[] = new int[100];
           System.out.println("enter the number u want to check in an array");
           int number = in.nextInt();
           int c=0;
           System.out.println("enter an array");
           for(int i=0;i<arr.length;i++)
           {
                arr[i] = in.nextInt();
                if(number==arr[i])
                {
                     c++; 
                     break;
                }
           }
            if(c==1)
            {
                System.out.println(number+" is present in an array");
            }
            else {
                 System.out.println("not present");
            }
                    
           
           
           
}
}
