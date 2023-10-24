 class StaticMethods{

    static void ChangewithValue(int a)
    {
           a = 23;
    }

    static void ChangeWith_Reference(int arr[])
    {
           arr[0]= 123;
    }
       static void name()  // if we use static we dont need to create object we can 
       // dircect call the function
       {
           System.out.println("NOMAN SHAKIR");
       }

}
public class SaticMethod12{
    
    public static void main(String[] args) {
        
        StaticMethods.name(); // use class name bcos 2 diff classes

        int x=5;
        StaticMethods.ChangewithValue(x);
        System.out.println("The number after change = "+x); // it doesnot chane the value

        System.out.println();

        int mark[] = {12,43,53,1,4};
  StaticMethods.ChangeWith_Reference(mark);// it cahnge value bcos iska reference pass kia hum ney
        System.out.println("the mark = "+mark[0]);
    }
}
