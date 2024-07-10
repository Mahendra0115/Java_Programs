class M3_Even {
    // Take nothing return nothing 
   static void Even(){
    int num =55;
    String res = "";

    if(num%2 == 0){
      res ="Even";
    }else{
        res = "odd";
    }
    System.out.println(res);

   }
    public static void main(String args[]){
       Even();
    }
}
