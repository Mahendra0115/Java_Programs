public class StaticToStatic {

    static void m1(){
        System.out.println("this is static method: ");
    }

    void m2(){
        System.out.println("this is non static methhod: ");
    }
    
}

class Mix{
    public static void main(String[] args) {
        StaticToStatic.m1();
    }
}

