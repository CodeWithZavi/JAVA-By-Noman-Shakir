import java.util.Scanner;
public class ObjectAndClass{

      // first we define comman properties


      Scanner s = new Scanner(System.in);    
     int age = s.nextInt(); // input age
     String name  = "Noman";// input string
     String color = "White"  ;
     // now some behaviour

       void eat()
       {
          System.out.println("I am eating");
       }
       void sleep()
       {
         System.out.println("I am sleepin");
       }

       public static void main(String[] args) {
        System.out.println("enter age name and colour");
          
        // make an object of a class for accesing them
         ObjectAndClass p = new ObjectAndClass();
         System.out.println("Name is :"+p.name);
         System.out.println("colour is :"+p.color);
         System.out.println("age is "+p.age);
         System.out.println();

         // for accessing behaviour 
         p.eat();
         p.sleep();
        }
}

 