package Methos_programs;
 class M2_Positive {
    // Return somthing take nothing
    static String PositiveNum(){
       int num = -6;

       if(num > 0 ){
        return ("positive: ");
       }else{
        return ("negative: ");
       }

    }
     public static void main(String args []){
       String result = PositiveNum();
       System.out.println(result);
     }
}
