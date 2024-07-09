 class find_Prime {
   

    static String Prime(){
     int num =51;
        
        if(num%num == 0 && num%1 == 0){

            return("prime no: ");

       }else{
           return("not prime: ");
       }


    }
    public static void main(String[] args) {
      
        
    //  Prime();
       
      String res = Prime();
      System.out.println(res);
       
    }
}
