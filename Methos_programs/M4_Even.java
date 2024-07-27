package Methos_programs;
 class M4_Even {

     // return somthing take nothing
      static String Even(){
        int num = 10 ;
         
        if(num%2 == 0 ){
            return ("even") ;
        }else{
            return ("odd");
        }

        
      }
     public static void main(String args[]){

       String Result = Even();
       System.out.println(Result);
     }
}
