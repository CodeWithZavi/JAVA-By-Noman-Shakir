public class contructor{

       int b;
       String name;
       contructor() // contructor (specail method) // u can display the value
       { 
            b = 0;
            name = null;
                
               
       }
       void show()
       {
              System.out.println(b+" "+name);
               
       }
}

       // make an another class for an object

       class B{
                public static void main(String[] args) {
                     
                       contructor ref = new contructor(); // it would call auotomatically

              // and for void show :
               ref.show();
                }
       }

