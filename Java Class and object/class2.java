 class A {
      
    int x;
    String b;
      A(int a,String c)
      {
          x = a;
          b = c;

          System.out.println(x+" "+c);
      }


      A(A ref)
      {
          int q = ref.x;
          String p = ref.b;
          // i am using print function
          System.out.printf("age is %d and name is %s",q,p);
          
      }
 }
 class class2 {
    
   public static void main(String[] args) {
    
      A ref = new A(12, "noman");
      new A(ref);  // it copy all data from 1st object

     
   }
         
}
