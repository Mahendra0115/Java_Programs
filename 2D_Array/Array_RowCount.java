 class Array_RowCount {
    public static void main(String[] args) {
        int arr[][] = { { 9, 2, 4}, { 7, 8, 23}, { 7, 8, 6 } };
        int i = 0;
        
        int sum = 0;


        while (i < arr.length) {
            sum = sum + arr[i][1];
            i++;
        }

      
        System.out.println("Sum of frist row is : " + sum);
    }
}
