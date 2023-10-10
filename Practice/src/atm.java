
import javax.swing.JOptionPane;
public class atm{

     public static void main(String[] args) {
        
        gui cal = new gui(555,10000.10);
        
        int TotalChanes = 5;
        int password;
        int PASS = cal.getPASS();
        for(int i = TotalChanes;i>0;--i)
        {
             
            password = Integer.parseInt(JOptionPane.showInputDialog("ENTER YOUR ACCOUNT PASSWORD"));

            if(password==cal.getPASS())
            {
                 break; // control go outside the loop

            }
            --TotalChanes;
        }
         if(TotalChanes==0) {
                JOptionPane.showMessageDialog(null,"Sorry cant acccess you enterd Invalid Pass");
            }
         else {
              String option [] = {"Deposit","Withdraw","CheckBalance","Close","Close ATM"};
          if(PASS==cal.getPASS())
          {
              while(true)  // it give option multiples type
              {
               
                 int choice = JOptionPane.showOptionDialog(null, "Enter option", "ATM",
                   0, 2, null, option, option[2]);
                   switch(choice)
                {

                      case 0 ->                       {  // we can use brakets in switch cases which allow to allow us to set varible name same Eg cash
                        double cash = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter The Amount"));
                      cal.Deposit(cash);
                      }

                      case 1 ->                       {
                        double cash = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the Amount"));
                      cal.WithdrawCash(cash);
                      }

                      case 2 ->                       {
                         JOptionPane.showMessageDialog(null, "Your Balance in your Account = "+cal.setBal());
                      }
                      case 3 ->                       {
                         System.exit(0); // use for terminate the program 
                      }
                      default ->                       {
                         JOptionPane.showMessageDialog(null, "Invalid CHOICE");
                      }

                }

              }

                
              

          }
           
     }
         }
         

         // now for giving option to user 
        
}

class gui {
     
      private int password;
      private double balance;
      gui(int pass,double bal)
      {
         this.password = pass;  // store in priv varible password
         this.balance = bal;  // store in priv varible balance
      }
      public int getPASS()
      {
          return this.password;
      }
       public double setBal()
      {
           return this.balance;
      }
      public void Deposit (double cash)
      {
          if(cash!=0)
          {
             this.balance = this.balance+cash;
          JOptionPane.showMessageDialog(null, cash+" Amount adds to your account \n Your Total Balance = "+this.balance);
          }
          else {
             JOptionPane.showMessageDialog(null, "You Entered Invalid Amount");
          }
      }
      public void WithdrawCash(double cash)
        {
              if(cash!=0)
              {
                 this.balance = this.balance - cash;
                 JOptionPane.showMessageDialog(null,cash+" Amount Deduct form your acoount \n Remainig amount is "+this.balance);
              }
              else {
                 JOptionPane.showMessageDialog(null, "You Entered Invalid Amount");
              }
        }
        public double Check_Balance()
        {
             return this.balance;
        }



}