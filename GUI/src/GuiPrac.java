import javax.swing.*;
public class GuiPrac{
     public static void main(String[] args) {
        
         JFrame frame = new JFrame();
         frame.setTitle("Sardar Noman");
         frame.setSize(500, 500);
         frame.setLayout(null);
         frame.setVisible(true);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

         JPanel panel = new JPanel();
         panel.setBounds(0, 0, 250, 250);
         panel.setVisible(true);
         frame.add(panel);
         JPanel panel1 = new JPanel();
         panel.setBounds(0, 0, 250, 250);
         panel.setVisible(true);
         frame.add(panel1);

         
           
     }
}
