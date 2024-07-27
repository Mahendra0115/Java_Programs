package Methos_programs;
// Take Somthig and Return Somthing
class M3_Ex3{
   
static int Add(int num1 , int num2){
       int res = num1+num2;

    return res;
}
    public static void main(String args[]){
        int n1 = 5;
        int n2 = 6;

         int Addition = Add(n1,n2);
         System.out.println(Addition);
    }
}
