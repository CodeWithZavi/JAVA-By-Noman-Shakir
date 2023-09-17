 class copyConstructor {

      int a;
      String b;
    copyConstructor()
    {
          a = 12;
          b = "noman";
          System.out.println(a+" "+b);
    }
    copyConstructor(copyConstructor ref)
    {
          int c = ref.a;
          String d = ref.b;
          System.out.println(c+" "+d);
    }
    
}
class copy{
      public static void main(String[] args) {
        
          copyConstructor ref = new copyConstructor();
          copyConstructor ref2 = new copyConstructor(ref); // copy first obj in 2nd
          /*new copyConstructor(ref);  you also can simple write this*/
          
      }
}
