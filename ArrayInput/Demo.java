import java.util.Scanner;

// Taking input using   Arrays.toString() Method
   
 /* 
import java.util.Arrays;
import java.util.Scanner;

public class Demo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// declearing Array
        int arr[] = new int[3];

        // taking Array Input
        for(int i=0;i<arr.length;i++){
            System.out.println("enter the value of Array:");
            arr [i] = sc.nextInt();
           
            String data = Arrays.toString(arr);
            System.out.println(" " +data);
        }
          
    }
}

*/

                       //  Second Way to print Array
/* 
 public class Demo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr1 [] = new int[5];

        // Scanning Array
        System.out.println("Enter the value:");
        for(int i=0; i<arr1.length; i++){
           arr1[i] = sc.nextInt();
        }

        // printing Array
        System.out.println("Print Array:");
        for(int i=0; i<arr1.length; i++){
           System.out.print(" " +arr1[i]);
         }
    }
 }
    */
 

                   // Using While loop

                   /* 
    public class Demo {
        public static void main(String args[]){
           Scanner sc = new Scanner(System.in);

           int arr[] = new int [5];
           int i = 0;

           System.out.print("Enter Array Value:"); 

           while(i<arr.length){
            arr[i] = sc.nextInt();
            i = i+1;
           }

           System.out.print("Enter Array Value:"); 
           while(i<arr.length){
           System.out.print(" " +arr);
            i = i+1;
           }

        }
    }  

    */
    import java.util.Arrays;
    public class Demo {
        public static void main(String args[]){
           Scanner sc = new Scanner(System.in);

           int arr[] = new int [5];
           int i = 0;
           String data = " ";

           System.out.print("Enter Array Value:"); 

           while(i<arr.length){
            arr[i] = sc.nextInt();
            i = i+1;
           }

           System.out.print("Enter Array Value:"); 
           do{
            i = i+1;
             data = Arrays.toString(arr);
           }while(i<arr.length);
           System.out.print(" " + data);
        }
    }  


