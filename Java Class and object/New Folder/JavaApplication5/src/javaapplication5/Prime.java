/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication5;
import java.util.Scanner;
public  class Prime{

       
       int Check(int number)
       {
           int divi =0;
          for(int i=2;i<=number/2;i++)
          {
              if(number%i==0)
              {
                 divi++;
              }
          }
          if(divi==0)
          { 
              return 1;
          }
          else 
          {
            return 0;
          }
           
       }

     
}

 class PrimeNumber{
    
        
        public static void main(String[] args) {
            
             Scanner input  =  new Scanner(System.in);

             int num = input.nextInt(); // input

             PrimeNumber obj = new PrimeNumber();
             int ch = obj.Check(num);
             if(ch==1)
             {
                  System.out.println(num+" is prime number");
             }
             else {
                  System.out.println(num+" is not prime number");
             }
         }
}
