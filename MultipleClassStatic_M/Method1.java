// Static to static 

 class Mix {
   static void m1(){
        System.out.println("Mix class: m1 called ");
    }
}

class Method1{
    static void m2(){
        System.out.println("Mix2 class: m2 called ");
        Mix.m1();
    }
    public static void main(String[] args) {

       m2();
    }
    
}
