 class M_Scriptfp {
    // Use Non-Static Method in Non-Access Modifire 
    strictfp  void m1(){
      System.out.println("this is Scriptfp Non Access Modifires: ");
    }

    // Use Static Method in Non-Access Modifire 
    strictfp static void m2(){
        System.out.println("this is Scriptfp Non Access Modifires: ");
      }
    public static void main(String[] args) {
        M_Scriptfp scriptfp = new M_Scriptfp();
        scriptfp.m1();
    }
}
