package sum;

public class ArraySum{
    public static void main(String[] args) {
        int arr[] = {5,7,3,9,7};
        int total = 0;
        int sum = 0;
        int i =0 ;

        while(i<arr.length){
             total = total+arr[i];
             sum = total;
             
            i++;
        }
        if(sum > 0){
            System.out.println("Positive");    
        }else{
            System.out.println("negative");
        }

        System.out.println("Array sum is: "+sum);
    }
}
