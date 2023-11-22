public class StaticMethod {
    private int a;
    private static int b;
    
    //one argument constructor
    public StaticMethod(int arg){
        b +=arg;
        a=arg;
     }
   //No argument constructor
    public StaticMethod(){
      for(int i=1;i<=5;i++)
          ++b;
      }
    public void setA(int value){
        a=value;
        setB(value);//static method
        
    }
    public  static void setB(int value){
        if(value==5)
            return;
        b +=value;
       
       
    }
        
    public static void showInfo(StaticMethod obj){
        System.out.printf("Object: %d \t %d\n",obj.a,obj.b);
    }

public static void main(String arg[]){
    
    
     StaticMethod obj1=new StaticMethod();
     showInfo(obj1);
     
     StaticMethod obj2 =new StaticMethod(5);
     showInfo(obj2);
     showInfo(obj1);
     obj1.setA(10);
     
     showInfo(obj1);
     showInfo(obj2);
     
     obj1.setA(5);
     
     showInfo(obj1);
     showInfo(obj2);
}
}
