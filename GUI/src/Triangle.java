/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ZAVIAN ~
 */
import javax.swing.JOptionPane;
public class Triangle {
    
      public static void main(String[] args) {
        
          double base = Double.parseDouble(JOptionPane.showInputDialog("enter base of triangle"));
          double perpendicular = Double.parseDouble(JOptionPane.showInputDialog("enter perpendicular"));
          
          double hyp = Math.sqrt((base*base)+(perpendicular*perpendicular));
          
          JOptionPane.showMessageDialog(null, "Hypotenous of triangle is "+hyp);
          
          
          
            
            
    }
}
