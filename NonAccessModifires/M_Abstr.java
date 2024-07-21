abstract class M_Abstr {
    // Use Non-Static Method in Non-Access Modifire 
    abstract  void m1(){
      System.out.println("this is Scriptfp Non Access Modifires: ");
    }
    // Use Static Method in Non-Access Modifire 
   abstract static void m2(){
        System.out.println("this is Scriptfp Non Access Modifires: ");
      }
    public static void main(String[] args) {
      M_Abstr abst = new M_Abstr();
        abst.m1();
    }
}
