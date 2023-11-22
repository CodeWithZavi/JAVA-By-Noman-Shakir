
public class StaticMethod1{
    
     int number;
     String name;
     double value ;
    private privclass()
    {
          number = 223;
          name="noman";
          value = 2.23;
          System.out.println(number+"  "+name+"  "+value);
    }
     public static void main(String[] args) {
         
          privclass ref = new privclass();  // u cant access it by making another classs 

     }
}
