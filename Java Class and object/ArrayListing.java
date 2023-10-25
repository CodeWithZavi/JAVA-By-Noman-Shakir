import java.util.*; // mean u use everthing u want
public class ArrayListing {
    
     public static void main(String[] args) {
        
          ArrayList <Integer> L1 = new ArrayList<>();
          ArrayList <Integer> L2 = new ArrayList<>(5);
          L2.add(23);
          L2.add(20);
          L1.add(2);L1.add(3); L1.add(5); L1.add(6);
          L1.add(0,10); // now ist index pa yeh print hoga
             // now if i add both l1 and l2

             L1.addAll(/*0,*/L2);  // if i add index 0  it print l2 and l1 elements

             // and if i want to clear All we use
           //  L1.clear();

            // now if we check for some element
             System.out.println(L1.contains(6)); // if present return ture

             // for getting index 
             System.out.println(L1.indexOf(5));

             // if u want to remove
             L1.set(1,334);
             L1.remove(3);  // it remove 5
             for(int i =0;i<L1.size();i++)
             {
                System.out.print(L1.get(i));
                System.out.print(",");
             }
            
           
     }
}
