import java.util.Stack;

public class StacksCon {
   
    public static void main(String[] args) {
        
          Stack <String> stack = new Stack<>();

         // System.out.println(stack.empty());
         stack.push("Spider man");
            stack.push("Batman");
            stack.push("Ninja");
            stack.push("pubg");
            stack.push("Fornite");
            
             // stack.pop();// it will remove fornite cos yeh top pa parhi vi stack me
           //   stack.pop();// it will remove pubg
            // ab agar check krian stack
              System.out.println(stack.empty());


            // for extracting last game jo sab se uper ha 
           // String myfavgame = stack.pop();// it will remove fornite

            System.out.println(stack);

         //   System.out.println("my fav game is = " +myfavgame);

            // and u wanna print the final item jo top pa ha use peek

            System.out.println(stack.peek());// it will give top item


            // now for the position 

            System.out.println(stack.search("Fornite"));
            System.out.println(stack.search("pubg"));
            System.out.println(stack.search("Spider man"));
           

            // // ab agar hum ak game ki 1 million copies add krain memory mian to heap error aie ga
            // for(int i = 1; i < 10000000000000000 ; i++)
            // {
            //      stack.push("Need for speed");
            // }


            // uses of stack 
            


    }

}