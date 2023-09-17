 // Default comstructor
 class B{
    
      int a; String name;
      boolean c;


   B()
      {
         
            a = 12;
             name = "noman";
              c = true;
    }
    void show()
    {
           System.out.println(a+"  "+name+"  "+c);
     }
} 

 class A  {

      public static void main(String[] args) {
        
          B ref = new B();
          ref.show();
         
      }
}
