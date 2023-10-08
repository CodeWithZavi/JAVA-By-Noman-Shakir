/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ZAVIAN ~
 */
 class CopyFrompriv{

        int a ;
        String name;
         CopyFrompriv(int b,String n)
         {
               a = b;
               name = n;
         }
         CopyFrompriv(CopyFrompriv ref)
         {
               System.out.println("value is "+ref.a+" and name = "+ref.name);
         }
    
}
public class CopyFromParConstructor {
    
     public static void main(String[] args) {
        
          // make an object 
          CopyFrompriv cal = new CopyFrompriv(12,"noman"); // it assigm the value
          CopyFrompriv copy = new CopyFrompriv(cal); // it copy the value
    }
}
