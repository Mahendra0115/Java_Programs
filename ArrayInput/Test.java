 class  Test1{
    
    static void positive() {
        // int total = 0;
        int arr[] = {1,2,3,4};
        int positive = 0;

        for(int i=0; i<arr.length; i++){
            System.out.print(" " +arr[i]);
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i] >= 0){
                positive++;
                System.out.print(arr[i]);
            }
        }
        System.out.println();
      System.out.println("Num is Positive"+ positive);
    }
}


   // Example Using (varr,length,argument)
class Test {
    static void sum(int ...arr){ // use here --> varr,length,argument
        int total = 0;
        for(int i=0; i<arr.length; i++){
            total = total+arr[i];
            System.out.print(" " +arr[i]);
        }
        System.out.println();
        System.out.print("Sum is: " + total);
    }
    
    public static void main(String []args) {
        // int arr[] = {1,2,3,4};
        sum(4,5,6,7,8,9);
        Test1.positive();
    }
}
