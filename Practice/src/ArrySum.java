/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ZAVIAN ~
 */
import java.util.Scanner;
public class ArrySum {
    
     public static void main(String[] args) {
        
         Scanner in = new Scanner(System.in);
           double arr[] = new double[5];
           double sum = 0;
           for(int i=0;i<arr.length;i++)
           {
                arr[i] = in.nextDouble();
                sum = sum + arr[i];
           }
           System.out.println("sum = "+sum/arr.length);
               
           
               }       
    
}
