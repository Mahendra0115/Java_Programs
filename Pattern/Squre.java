class Squre {
    public static void main(String[] args) {
        int no = 4;
        int sum =0; 

        // Using nested loops
        for(int i =1; i<= no; i++){
          for(int j=1; j<= no; j++){
            System.out.print(" "+i);

            //  sum of frist  row 
                if(i == 1){
                    sum = sum+i;
                }
            }
        System.out.println();
    }

 
 System.out.println("sum "+ sum);
}
}
