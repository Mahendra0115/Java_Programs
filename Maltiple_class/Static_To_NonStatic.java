 class Static_To_NonStatic {
    static void m1(){
         System.out.println(" this is static method: ");
    }
}

class Test{
      void m2(){
        System.out.println("  This is non static method: ");
        Static_To_NonStatic.m1();
      }
    public static void main(String[] args) {
        Test test = new Test();
        test.m2();
    }
}