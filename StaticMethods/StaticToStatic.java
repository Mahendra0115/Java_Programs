package StaticMethods;


  class StaticToStatic {

    static void M1(){
      System.out.println("This is static method:");
    }

    public static void main(String args[]){

        System.out.println("This is main method: ");
        M1();
        System.out.println("OUT");

    }
}
