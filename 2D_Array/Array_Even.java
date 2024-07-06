class Array_Even {
    public static void main(String[] args) {
        
        int arr[][] = { { 9, 2, 4}, { 7, 8, 23}, { 7, 8, 6 } };
        int i = 0;
        // int even =0 ;
        // int odd = 0;
        int even = 0;
        int odd = 0;

        int froweven = 0;


        while (i < arr.length) {
           froweven = froweven+arr[0][i];
            int j = 0;
            while (j < arr.length) {

                if (arr[i][j] % 2 == 0) 
                {
                    even++;
                }
                else {
                    odd++;
                }

                j++;

            }

            i++;
        }

        System.out.println("Even is: " + even);
        System.out.println("odd is " + odd);
        System.out.println("EVEN VALUE IN ONLY FRIST ROW IS : "+ froweven);
    }
}
