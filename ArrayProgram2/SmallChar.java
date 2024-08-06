package smallchar;

public class SmallChar{
    public static void main(String[] args) {
      
            int arr [] = {'a','A','c','D','r','y'};
            int arr2[] = { } ;

            int small = 0;
            int i = 0;
            while (i<arr.length) {
               if(arr[i]>= 97 && arr[i]<= 122){
                 small++;
               } 
                i++;
            }
           
         System.out.println("small is: "+ small);
         
    }
}
