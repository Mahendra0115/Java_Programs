// Non-Static to Static

class Mix{
    void m1(){
System.out.println("Non-Static method:");
    }
}
 class Method3 {
    static void m2(){
        
        System.out.println("Static method:");
        Mix mix = new Mix();
        mix.m1();
        
    }
    public static void main(String[] args) {
        m2();
    }
}
