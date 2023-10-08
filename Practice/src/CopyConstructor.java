/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ZAVIAN ~
 */

 class Copy{
    
      
       int a;int b;
       Copy()
       {
            a = 12;
            b = 15;
       }
       Copy(Copy ref)  // it copy the value of a and b
       {
             int c = ref.a;
             int d = ref.b;
             System.out.println("values are "+c+"and"+d);
       }
      
}
public class CopyConstructor {
    public static void main(String[] args) {
        Copy cal = new Copy();
        Copy cal1 = new Copy(cal);
        
        
    }
      
}
