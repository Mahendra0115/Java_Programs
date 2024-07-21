public class ArrayPrectice {
    public static void main(String[] args) {
        // int arr[] = new int[4];
        
        // arr[0] = 4;
        // arr[1] = 7;
        // arr[2] = 6;
        // arr[3] = 1;

           //  (or)

           /* 
           int arr[] = {5,6,7,8,9,1,5,23};

        int i = 0 ;
        int arrsum = 0;
        System.out.println("Original Array is: ");
        while(i <= 7){
              arrsum = arrsum+arr[i];
              System.out.print(" "+arr[i]);
            i++;
        }
        
        System.out.println();
        System.out.println("Array sum is : "+arrsum);

        if(arrsum%arrsum == 0 && arrsum%1 == 0){
            System.out.println("prime");

    }else{
        System.out.println("not prime:");
    }

    */

   // 2D Array 
     

   /*  
   int arr[][] = new int [3][3];

   arr[0][0] = 5;
   arr[0][1] = 9;
   arr[0][2] = 3;

   arr[1][0] = 7;
   arr[1][1] = 5;
   arr[1][2] = 9;

   arr[2][0] = 3;
   arr[2][1] = 7;
   arr[2][2] = 7;

  */
    int arr1 [][] = {{5,5,8},{7,6,8},{7,8,3}};

        for(int i =0; i<=2 ; i++){
             for(int j=0; j<=2; j++ ){
               System.out.print(" "+arr1[i][j]);
             }
             System.out.println();
        }
         
    }
}
