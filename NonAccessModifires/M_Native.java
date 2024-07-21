class M_Native {

      // Use Static Method in Non-Access Modifire 
      native static void m2(){
        System.out.println("this is native: ");    
    }

      // Use Non-Static Method in Non-Access Modifire 
      native  void m1(){
        System.out.println("this is native: ");    
    }
    public static void main(String[] args) {
        M_Native native1 = new M_Native();
        native1.m1();
        m2();

    }
}
