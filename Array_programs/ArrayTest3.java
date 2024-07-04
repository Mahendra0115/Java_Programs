 class ArrayTest3 {
    public static void main(String args[]){
        int arr1[]= {4,5,2,3,6};
        int sum = 0; 

        // for loop
/* 
        for(int i=0; i<5; i++){
            sum = sum+arr1[i];
        }

        System.out.println(sum);

*/


 int i =  0;
 do{
    sum = sum+arr1[i];

    i++;
 }while(i < 5);
    }
}
