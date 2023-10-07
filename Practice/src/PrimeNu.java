/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ZAVIAN ~
 */
import java.util.Scanner;
public class PrimeNu {
      public static void main(String[] args) {
            System.out.println("enter the number");
            Scanner in = new Scanner(System.in);
            int start = in.nextInt();
            int end = in.nextInt();
           int sum = 0;
           int count=0;
             for(int i=start+1;i<=end;i++)
             { 
                   int d = 0;
                  for(int j=2;j<i;j++)
                  {
                      
                      if(i%j==0)
                      {
                           d++;
                           break;
                      }
                  }
                  if(d==0)
                  {
                      sum+=i;
                      
                      System.out.println(" prime = "+i);
                      count++;
                      
                  }
                
             }
              System.out.println("sum  = "+sum);
              System.out.println("total prim = "+count );
    }
}
