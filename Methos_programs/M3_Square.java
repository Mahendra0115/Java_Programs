package Methos_programs;
class Square{
    // take somthing return somthing
    static int Squre(int num){
       int res = num*num;
       return res;
    }
    public static void main(String args []){
        int n = 2;
        int result = Squre(n);
        System.out.println(result);
    }
}