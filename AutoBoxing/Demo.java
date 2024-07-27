 public class Demo {


    static void boxing(){
    System.out.println("This is boxing Exp:");
        // boxing
      int a = 10;
      Integer a1 = Integer.valueOf(10);
      System.out.println(a1);
     
    }

    static void unboxing(){

        // Unboxing
    System.out.println("This is unboxing Exp:");

      Integer a = Integer.valueOf(10);
      Integer b = Integer.valueOf(4);
      Integer c = Integer.valueOf(a.intValue()+b.intValue());
      System.out.println(c.intValue());

    }
    static void autoboxing(){
        System.out.println("This is Autoboxing Exp:");
        // Autoboxing 
       Integer a = 10;
       Integer b = 20;
       Integer c = a+b;
       
       System.out.println(c);
    }

    public static void main(String[] args) {
        boxing();
        unboxing(); 
        autoboxing();
        System.out.println("out");

    }
}
