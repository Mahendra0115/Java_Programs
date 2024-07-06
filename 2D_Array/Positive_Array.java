
class Positive_Array {
    public static void main(String[] args) {
        
    
    int arr1[][] = {{4,6,4,6,8},{2,4,6,8,7},{2,6,4,2,4}};
    int sum =0;
    int i =0;
   
    while(i < 3){

        int j = 0;
          while (j < 5) {
            
               System.out.print(" "+arr1[i][j]);
               sum = sum+arr1[i][j];
            

               j++;
          }
          System.out.println();
        i++;
    }
    System.out.println("sum is : "+ sum);

 }
}
