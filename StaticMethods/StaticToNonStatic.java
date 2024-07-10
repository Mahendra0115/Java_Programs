 class StaticToNonStatic {

    // static method
    static void M1(){
        System.out.println("      This is STATIC method: ");
    }


    // Non Static Method
     void M2(){
        System.out.println(" This is NON-STATIC method: \n {");
        M1();

    }

    public static void main(String[] args) {
       System.out.println("  this is main method:");

         // creating Object

       // Location_Name      // Ref_Varr   // operator    //KeyWord   // Spatital_Method(Constructur)
       StaticToNonStatic      stns           =            new          StaticToNonStatic();
         stns.M2();

        System.out.println("  } \n Out ");

    }
}
