public class Variables{

     int a = 10; // instance variable 
     static double b = 10.5;// 
    public static void main(String[] args) {
        boolean c = true; // local variable

        // we cant acess intance variable without object of the class
        // for making classs :

          Variables s = new Variables();// we access the instance variable 
          // now for printing :
          System.out.println(s.a);

        // for other we dont need any object
        System.out.println(b);
        System.out.println(c);

        // for print in one line 

        System.out.println(s.a+" "+b+" "+c);
        
        

        

    }
}