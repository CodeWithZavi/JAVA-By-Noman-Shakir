public class Break {
    
      public static void main(String[] args) {
        

        for(int i=1;i<=10;i++)
        {
             if(i==5)
             {
                break;
             }
             
             System.out.print(i+" ");
        }
        System.out.print("\n");
        for(int i=1;i<=10;i++)
        {
             if(i==8||i==4||i==6)
             {
                continue;
             }
             
             System.out.print(i+" ");
        }
      }
       
      }
