class Squre {
    public static void main(String[] args) {
        int no = 3;
        // cha no1 = 'B';
        int sum =0; 

        // Using nested loops
        for(int i =1; i<= no; i++){
            
          for(int j=1; j<= no; j++){
         
            System.out.print(" A ");
            System.out.print(" B ");

        //    System.out.print(" "+i);
                if(i == 1){
                    sum = sum+i;
                }
            }
           
        System.out.println();
    }

 
 System.out.println("sum "+ sum);
}
}
