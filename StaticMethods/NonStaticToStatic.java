// package StaticMethods;

public class NonStaticToStatic {


      void M2(){
        System.out.println("This is NON-STATIC  method: ");
       
      }
  
      public static void main(String args[]){
  
          System.out.println("This is main method: ");
          // creating object 
          NonStaticToStatic stns = new NonStaticToStatic();
           stns.M2();

          System.out.println("OUT");
  
      }
}
