package Methos_programs;
class M3_Even {
    // Take somthing return somthing 
   static String Even(int num){
      if(num%2 == 0){
        return ("Even: ");
      }else{
        return("odd");
      }
   }
    public static void main(String args[]){
        int n = 10;
       String result = Even(n);
       System.out.println(result);
    }
}
