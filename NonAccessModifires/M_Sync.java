 class M_Sync {

    synchronized  static void m1(){
        System.out.println("Static Mehtod: ");

    }

    synchronized   void m2(){
        System.out.println("Non Static : ");
        
    }
    public static void main(String[] args) {
         m1();
         M_Sync sync = new M_Sync();
         sync.m2();

    }
}
