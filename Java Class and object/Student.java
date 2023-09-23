public class Student{
      public static void main(String[] args) {
        
         StudentInfo calll = new StudentInfo();
         calll.ShowInfo();
       
        n1 n = new n1();
         System.out.println("value is "+n.number());

      }
}

class StudentInfo{

       String Name;
       int rollno;
       
       StudentInfo()
       {
          Name = "noman";
          rollno = 1;
       }

       void ShowInfo()
       {
         System.out.println("name = "+Name);
         System.out.println("roll no = "+rollno);
      //   System.out.printf("name =%s\n",name);
       }
}
class n1
{
      
       int number()
       {
        return 1;
          
       }
}