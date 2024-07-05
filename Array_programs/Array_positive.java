 class Array_positive {
   public static void main(String args[]){

    int arr[];
    arr =  new int[7];

    arr[0] = 4;
    arr[1] = -45;
    arr[2] = 24;
    arr [3] = 10;
    arr[4] = -15;
    arr[5] = 12;

    int i=0;
    
//  int ctr = 0;
 int Pos_Ctr = 0;
 int Neg_ctr = 0;
int positive ;
int Negative  ;
 /* 
    while(i<5){
      if(arr[i]>= 0){
        Pos_Ctr = Pos_Ctr+1;
      }else{
        Neg_ctr = Neg_ctr+1;
      }
        i++;
    }

System.out.println("positive is: "+Pos_Ctr);
System.out.println("Negative is: "+Neg_ctr);

*/


// using do loop 

/* 
do{
    if(arr[i]>= 0){
        
      Pos_Ctr = Pos_Ctr+1;
    }else{
       
      Neg_ctr = Neg_ctr+1;
    }
      i++;
  }while(i<5);


  
System.out.println("Total positive no is: "+Pos_Ctr);
System.out.println("Total Negative no  is: "+Neg_ctr);

*/

// using for loop 

for(i= 0; i<5; i++){
    if(arr[i]>= 0){
        
        Pos_Ctr = Pos_Ctr+1;
      }else{
         
        Neg_ctr = Neg_ctr+1;
      }
}
System.out.println("Total positive no is: "+Pos_Ctr);
System.out.println("Total Negative no  is: "+Neg_ctr);

   } 
}
