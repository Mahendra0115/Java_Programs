class Prectise {

    static void FindEvenNum() {
        int arr[] = new int[4];
        int i = 0;

        int evenctr = 0;
        int oddctr = 0;

        arr[0] = 5;
        arr[1] = 7;
        arr[2] = 3;
        arr[3] = 8;

        while (i < arr.length) {
            // printing Array
            
            System.out.print(" " + arr[i]);
            // FINDING EVEN ODD
            if (arr[i] % 2 == 0) {
                evenctr++;
            } else {
                oddctr++;
            }
           
            i++;
           
        }
         System.out.println();
        System.out.println("total even is: " + evenctr);
        System.out.println("total odd is: " + oddctr);
    }

    static void Positive(){
        int arr[] = new int [4];

        arr[0] = 6;
        arr[1] = -7;
        arr[2] = -8;
        arr[3] = -7;

        int i = 0;
        int posctr = 0;
        int negctr = 0;

         while(i < arr.length){
            if(arr[i] > 0 ){
                posctr ++;
            }else{
                negctr++;
            }

            i++;
         }

         System.out.println("positive no:"+posctr);
         System.out.println("negative value: "+negctr);
    }

    static void PrimeNo(){

        int arr[] = new int[11];
        int i = 0;
        int prime = 0;
        int MaxValue = 0 ;

        arr[0] = 1;   arr[4] = 5;       arr[8] = 9;
        arr[1] = 2;   arr[5] = 6;       arr[9] = 10;
        arr[2] = 3;   arr[6] = 70;       arr[10] = 11;
        arr[3] = 4;   arr[7] = 85;
        
        while(i <arr.length){
            // finding max value
              if(arr[i] > MaxValue){
                MaxValue = arr[i];
              }
            i++;
        }
        if(MaxValue % MaxValue == 0 && MaxValue %1 == 0){
            System.out.println("prime no");
             prime = prime+MaxValue;
          }else{
            System.out.println("not prime");
          }


        System.out.println("Max no is: " + MaxValue);
        System.out.println(" this is prime num " + prime);
    }
    public static void main(String args[]) {
        // FindEvenNum();
        // Positive();
        PrimeNo();
    }
}
