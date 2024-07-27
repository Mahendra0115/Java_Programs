package Methos_programs;
class M3_Positive {
    // take somthing return somthing
    static String PositiveNum(int num){
       if(num >= 0){
        return ("Positive: ");

       }else{
        return("negative: ");
       }

    }

    public static void main(String args[]){
      int n = -5;
      String result = PositiveNum(n);
      System.out.println(result);
    }
}
