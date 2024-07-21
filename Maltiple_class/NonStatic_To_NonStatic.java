 class NonStatic_To_NonStatic {
   void m1(){
     System.out.println("non static to non static: ");
   } 
}

class Test{
    void m2(){
        System.out.println(" also non static to non static: ");
        N_static_To_N_static.m1();
    }
    public static void main(String[] args) {
         Test test = new Test();
         test.m2();
    }
}
