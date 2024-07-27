 // Non-Static To Non-Static
  class Mix2{
    void m1(){
        System.out.println("Non-Static method:");
    }
 }
 
 class Method4 {
    void m2(){
        System.out.println("Non-Static method:");
        Mix2 mix2 = new Mix2();
        mix2.m1();
    }
     static void main(String[] args) {
    Method4 m4 = new Method4();
        m4.m2();
   } 
}
