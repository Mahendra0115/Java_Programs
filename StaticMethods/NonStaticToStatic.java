// package StaticMethods;

public class StaticToNonStatic {


      void M2(){
        System.out.println("This is NON-STATIC  method: ");
       
      }
  
      public static void main(String args[]){
  
          System.out.println("This is main method: ");
          // creating object 
          StaticToNonStatic stns = new StaticToNonStatic();
           stns.M2();

          System.out.println("OUT");
  
      }
}
