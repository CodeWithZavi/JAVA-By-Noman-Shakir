/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ZAVIAN ~
 */
import javax.swing.JOptionPane;
public class userinfo {
    
    public static void main(String[] args) {
        
        
        
         String name = JOptionPane.showInputDialog(null,"enter your name");
         JOptionPane.showMessageDialog(null,"Hello "+name);
         
         int age = Integer.parseInt(JOptionPane.showInputDialog("enter your age"));
         JOptionPane.showMessageDialog(null, "your age  = "+age+" year");
    }
          
    
    
     
      
}
