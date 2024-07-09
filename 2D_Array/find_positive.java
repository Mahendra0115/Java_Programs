class  find_positive {
    
    public static void main(String[] args) {
        int arr[][] = {{7,9,-2,},{8,-9,5},{5,6,4}};

       int i = 0;
       int posno = 0;
       int negno = 0;
        
       // counting positive and negative no 
     int posctr = 0;
     int negctr = 0 ;


    




     System.out.println("Original Array is: ");
  
        while(i < arr.length){

            // count pos and neg frist row only 


            int j = 0 ;

               while (j< arr.length) {
                    if(arr[i][j] > 0 ){
                        posno = arr[i][j];
                        posctr ++;
                       
                    }else{
                        negno= arr[i][j];

                       
                        negctr++;
                    }
                    System.out.print(" "+arr[i][j]);
                    j++;

               }
               System.out.println();
               
            i++;
        }
   
        

        System.out.println("positive no :  " + posno);
        System.out.println("neg no "+ negno);
        System.out.println("negative ctr  no : " + negctr);
        System.out.println("negative ctr  no : " + posctr);



       
    }
}
