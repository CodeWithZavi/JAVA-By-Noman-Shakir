import java.util.Scanner;
  class student {
    
     String name ;
     int rollNo;
     double CGPA;
     String Section;
      void input()
     {
         
          try (Scanner input = new Scanner(System.in)) {
            name = input.nextLine();
            Section = input.nextLine();
              rollNo = input.nextInt();
              CGPA = input.nextInt();
              
        }
     }
     void Print()
     {
          System.out.println("Your name is "+name);
          System.out.print("You rollno is "+rollNo);
          System.out.printf("Your CGPA is %.2f\n", CGPA); 
          System.out.println("Your Section "+Section);
     }

}

public class UniClasss {
     public static void main(String[] args) {
        
        // System.out.println(" 'Welcome' please enter your information");
         Scanner in = new Scanner(System.in);
         String info = in.nextLine();
           student call  = new student();
           call.input();
           call.Print();
           
     }
}
