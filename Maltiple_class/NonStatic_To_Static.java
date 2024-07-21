
 
 class Test{
 void m1(){
    System.out.println("non static ");
    }
    // public static void main(String[] args) {
        
    // }
 }

 class NonStatic_To_Static {
    public static void main(String[] args) {
        Test test = new Test();
         test.m1();
        System.out.println("Out:");

    }
   
}
