// Static to Non-Static

class Test{
    static void m1(){
System.out.println("Static method ");
    }
}
 class Method2 {

    void m2(){
        
        System.out.println("Non-Static method ");
        Test.m1();
    }
    public static void main(String[] args) {
        Method2 test = new Method2();
        test.m2();
    }
}
