class ArrayTest2 {
    public static void main(String args[]){
        // Initialize Array
        int arr1[] = new int[5];
        
        // Array Elements
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        arr1[3] = 4;

        int sum = 0;


        int i = 0; // initialization 

       while(i < 5){   // condition 

        // statements
          sum = sum+arr1[i]; 


        i++; // increment / decrement
       }

       System.out.println(sum);
       

    }
}
