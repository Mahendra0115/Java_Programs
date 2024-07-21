 class M_Final {
    // static method 
    final static void test1(){
     System.out.println("Static  :");
    }

    strictfp void test2(){
        System.out.println("Non Static  :");
       }

      public static void main(String[] args) {
       test1();
       M_Final final1 = new M_Final();
          final1.test2();
    }
}
