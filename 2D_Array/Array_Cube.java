 class Array_Cube {
    public static void main(String[] args) {
        
        int arr [][] = {{1,4,3},{1,5,6},{4,2,5}};
        int arr2[][]  = new int [3][3];
        int i = 0;
       
        int sum = 0;
        // int cube = 0;
        while(i < arr.length){
            int j=0;
          
            while(j < arr.length){
                sum = sum+arr2[i][0];
                arr2 [i][j]= arr[i][j]*arr[i][j]*arr[i][j];
                System.out.print( " "+ arr2[i][j]);
                 
               
                j++;
            }
            System.out.println(" ");
            i++;
          
           
        }
       
        System.out.println("Sum of frist row  array elements: "+sum);
      
    }
   
}
