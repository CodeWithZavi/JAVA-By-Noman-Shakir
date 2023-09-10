public class ImutableStrings{
      
    public static void main(String[] args) {
        

               String str = "NOMAN"; //cant change Imutable
               String str1 = "NOMAN"; // it store in SCP in HEAP memory if same to it will not create another space for str1
                
               String str2  = new String("NOMAN"); /*it will store in HEAP but
                if objects are same it will refer to same location where the other object
               is present*/

             //  System.out.println(str);
             //  System.out.println(str1);
               System.out.println(str2);

               // if we want a change in str and str1 
              String change = str.concat(" SHAKER");
              String change1 = str1.concat(" SARDAR");
              System.out.println(change);
               System.out.println(change1);



    }
}