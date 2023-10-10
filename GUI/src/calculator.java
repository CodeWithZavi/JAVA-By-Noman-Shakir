import javax.swing.JOptionPane;
public class calculator {

      public static void main(String[] args) {
        
         
           int num1;
           int num2;

           num1 = Integer.parseInt(JOptionPane.showInputDialog("enter number1"));
          // JOptionPane.showMessageDialog(null, num1);

           num2 = Integer.parseInt(JOptionPane.showInputDialog("enter the number2"));
          // JOptionPane.showMessageDialog(null,num2);
            
          int choice = Integer.parseInt(JOptionPane.showInputDialog("Enter 1 for add\nEnter 2 for substraction\nEnter 3 for Multiplication\nEnter 4 for divide"));
          
          switch(choice)
          {   
                case 1 -> {
                    int sum = num1+num2;
                    JOptionPane.showMessageDialog(null, "Sum : "+num1+" + "+num2+ " = "+sum);
              }

                case 2 -> {
                    if(num1>num2)
                    {
                        int temp = num1;
                        num1 = num2;
                        num2 = temp;
                    }
                    int subtract = num1-num2;
                    JOptionPane.showMessageDialog(null, "Substraction : "+num1+" - "+num2+ " = "+subtract);
              }

                case 3 -> {
                    int mul = num1*num2;
                    JOptionPane.showMessageDialog(null, "Multiplication : "+num1+" x "+num2+ " = "+mul);
              }
                
                case 4 -> {
                    if(num1>num2)
                    {
                        int temp = num1;
                        num1 = num2;
                        num2 = temp;
                    }
                    int div = num1/num2;
                    JOptionPane.showMessageDialog(null, "Division : "+num1+" / "+num2+ " = "+div);
              }


              
          }
      }
}