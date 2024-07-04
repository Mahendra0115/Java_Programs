class Array_Qube {
     // take nothing return somthing 
     static int cube(){
        int arr1[] = { 1, 2, 3, 4, 5,6};
        int res = 0;
        int i = 0;

        while (i <= 5) {
            
            res = arr1[i]*arr1[i]*arr1[i];
            System.out.println("Squre is :" + res);
           
            i++;
           
        }

        return res;

        

     }
    public static void main(String args[]) {
     
        /*  
        int arr1[] = { 1, 2, 3, 4, 5,6};
        int res = 0;
        int i = 0;

        while (i <= 6) {
            System.out.println("Squre is :" + res);
            res = arr1[i]*arr1[i]*arr1[i];
           
            i++;
        }

        */

  int result = cube();
  System.out.println(result);


    }

}
