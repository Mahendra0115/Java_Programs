package Methos_programs;
class M1_Even {
    // take somthing return nothing
     static void Even(int n){
       
        if(n%2 == 0){
            System.out.print("even: ");
        }else{
            System.out.print("odd : ");
        }
        
     } 
    public static void main(String args[]){
         Even(6);
    }
}
