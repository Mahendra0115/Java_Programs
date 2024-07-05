 class Array_Even {
  public static void main(String args[]){
    int arr[] = {5,6,7,4,2,3,8,9};

    // count even and odd num in array 
    int Even_ctr = 0;
    int Odd_ctr = 0;
    int i = 0;

// using While loop 

 /*  
    while (i < 7){
           if(arr[i]%2 == 0){
              Even_ctr = Even_ctr+1;
           }
           else{
            Odd_ctr = Odd_ctr+1;
           }

        i++;
    }
    System.out.println("Even no is: "+Even_ctr);
    System.out.println("Odd no is: "+Odd_ctr);

*/

               // Using for loop 
/*  
  for(i = 0; i<7; i++){
    if(arr[i]%2 == 0){
        Even_ctr = Even_ctr+1;
    }else{
        Odd_ctr = Odd_ctr+1;
    }
    
  }   
  System.out.println("Even no is: "+Even_ctr);
  System.out.println("Odd no is: "+ Odd_ctr);

  */

  
   // Using Do Loop

   do{
    if(arr[i]%2 == 0){
       Even_ctr = Even_ctr+1;
    }
    else{
     Odd_ctr = Odd_ctr+1;
    }

 i++;
}while(i < 7);
System.out.println("Even no is: "+Even_ctr);
System.out.println("Odd no is: "+Odd_ctr);

  }    
}
