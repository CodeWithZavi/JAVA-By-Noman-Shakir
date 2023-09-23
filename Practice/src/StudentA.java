import java.util.Scanner;
public class StudentA {
    public static void main(String[] args) {
        
       // make an object 
       System.out.println("enter student information");
       info call = new info();
       call.input();
       call.Display();
     
    }
}
class info {
     
     private String name;
    private  String Reg;
    private  String Sec;
    private  int mark;

      void setName(String n)
      {
         name = n;
      }
      String getName()
      {
         return name;
      }
      void setREG(String regis)
      {
         Reg = regis;
      }
      String getReg()
      { 
           return Reg;
      }
      void setSection(String S)
      {
          Sec = S;
      }
      String getSec()
      {
          return Sec;
      } 
      void setMark(int MARKS)
      {
         mark = MARKS;
      }
      
      int getmark()
      {
         return mark;
      }

      void input()
      {
          try (// we make a Scanner class for input
          Scanner in = new Scanner(System.in)) {
            System.out.println();
            name = in.nextLine();
            Reg = in.nextLine();
            Sec = in.nextLine();
            mark = in.nextInt();
            System.out.println();
          }
      }
       void Display()
      { System.out.println();
        
         System.out.println("Name = "+getName());
          System.out.println("Reg = "+getReg());
           System.out.println("Sec = "+getSec());
            System.out.println("Mark = "+getmark());
      }
}
