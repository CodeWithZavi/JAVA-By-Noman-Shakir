 // paramterized construcotr
 class A{
      
      int x,y;

      A (int a,int b)
      {
          x = a;
          y = b;
      }
      // we can also make more
      A(int age,String name)
      {
         System.out.println(age+"  "+name);
      }
      void show()
      {
          System.out.println(x+"  "+y); 
      }
     
}
class classB{
      public static void main(String[] args) {
         
         A ref = new A(100, 333);
         A ref1 = new A(19, "noman");
          ref.show();
      }

}