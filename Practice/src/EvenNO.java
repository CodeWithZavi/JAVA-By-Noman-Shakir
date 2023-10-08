/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ZAVIAN ~
 */
import java.util.Scanner;
public class EvenNO {
    
       public static void main(String[] args) {
        
            Scanner in = new Scanner(System.in);
            System.out.println("Enter range of numbers");
            int range = in.nextInt();
            int number[] = new int[range];
            for(int i=0;i<range;i++)
            {
                 System.out.println("Enter "+(i+1)+" number");
                 number[i] = in.nextInt();
            }
            System.out.printf("Even number are = \t");
            for(int i=0;i<range;i++)
            {
                 if(number[i]%2==0)
                {
                    System.out.printf("%d ",number[i]);
                }
                 
            }
            System.out.println("");
              System.out.printf("Order number are = \t");

            for(int i=0;i<range;i++)
            {
                 if(number[i]%2!=0)
                {
                    System.out.printf("%d ",number[i]);
                }
                 
            }
             
    }
}
