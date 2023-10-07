public class arrayComapare {
    

     public static void main(String[] args) {
        
           int  arr1[] = {1,3,5,5,2};
          // int  arr2[] = {2,5,2,1,6}; 

           for(int i=0;i<arr1.length;i++)
           {
               for(int j=i+1;j<arr1.length;j++)
               {
                  if(arr1[i]==arr1[j])
                  {  System.out.println("array = "+arr1[i]);
                     
                  }

               }
           }
     }
}
