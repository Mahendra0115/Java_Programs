class Print2d_Array {
  public static void main(String[] args) {
        int arr[][] = new int[2][2];
    
          arr[0][0] = 5;
          arr[0][1] = 4;
          

          
          arr[1][0] = 4;
          arr[1][1] = 3;
         
         
// printing 2d array 
          for(int i = 0; i<arr.length; i++){
            for(int j =0; j<arr.length; j++){
                System.out.print(" "+arr[i][j]);
            }
            System.out.println();
          }




          // sum frist row 
 System.out.println("Sum of frist row:") ;
int sum = 0;
          for(int i = 0; i<arr.length; i++){
            for(int j =0; j<arr.length; j++){
                if(i == 0){
                  sum = sum+arr[i][j];
                }
            }
          
          }
         
          System.out.println(sum);




                // sum of frist row 
          System.out.print("sum of frist collum:\n");
          int i =0 ;
          sum = 0;
     while(i < arr.length){
      int j =0 ;
        while(j <arr.length){
       if(i == 0){
        sum = sum+arr[i][j];
       }
          j++;
        }
       i++;
     }  
     System.out.println(sum);
    }
}
