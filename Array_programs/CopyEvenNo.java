 class CopyEvenNo {
   public static void main(String[] args) {
    int arr1[] ={10,20,5,6,1};
    int arr2[] = new int[arr1.length];
    int i=0;
    while (i<arr1.length) {
       // if(arr1[i]%2 == 1){ // Odd num find
       if(arr1[i]%2 == 0){  // Even num find
            arr2[i] = arr1[i];
        }
        i = i+1;
    }
    for( i = 0; i<arr2.length; i++){
        if(arr2[i] != 0){
            System.out.println(arr2[i]);
        }
    }
   } 
}
