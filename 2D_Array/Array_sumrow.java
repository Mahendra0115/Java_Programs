 class Array_sumrow {
    public static void main(String[] args) {
        int arr[][] = {{4,5,7,5,2},{5,7,6,8,2},{8,9,3,5,6},{3,8,5,6,4}};

        int i= 0;
        int s_r_sum = 0; 
        while(i< arr.length){
             s_r_sum = s_r_sum + arr[0][i];
            i++;
        }
        System.out.println("count second row : " +s_r_sum);
    }
}
