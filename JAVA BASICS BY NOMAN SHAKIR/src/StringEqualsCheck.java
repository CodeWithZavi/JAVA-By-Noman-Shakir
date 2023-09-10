public class StringEqualsCheck {
    

    public static void main(String[] args) {
        
            String str = "NOMAN";
            String str1 = new String("NOMAN");
          
             //Example 1 
            if(str==str1) // it false the equation beacuse it check variables which are diff to is will go in else
            {
                 System.out.println("BOTH ARE EQUAL");
            }
            else {
                 System.out.println("BOTH ARE NOT EQUAL");
            }
            // Example 2
            System.out.println();
            if(str.equals(str1)) // it check and compare object in the variable which is true
            {
                 System.out.println("BOTH ARE EQUAL");
            }
            else {
                 System.out.println("BOTH ARE NOT EQUAL");
            }
    }
}
