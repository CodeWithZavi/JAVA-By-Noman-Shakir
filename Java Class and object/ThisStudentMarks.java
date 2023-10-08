import java.util.Scanner;
// Using this keyword : Ak reference ah jo current object ko refer krta ha 
public class ThisStudentMarks {
    
      public static void main(String[] args)
       {
             Scanner in = new Scanner(System.in);
           System.out.println("enter total marks");
           int TM = in.nextInt();
            A cal = new A();
            cal.Input(TM);
            cal.DisplayInfo(TM);
      }
}
class A{

     private  int mark;
     private int total;
     private double average;
 Scanner in = new Scanner(System.in);
       void Input(int TM)
{ 

      System.out.println("Enter Student data");
      for(int i=0;i<5;i++)
      {
            mark = in.nextInt();
            this.total +=mark;
      }
     this.average = (double)this.total/TM*100;
      
}
void DisplayInfo(int TM)
{
      System.out.printf("\n");
       System.out.println("Student Obatained "+total+" out of "+TM);
       System.out.println("Averge  = "+average);
}
}


