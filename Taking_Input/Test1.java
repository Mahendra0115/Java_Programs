import java.util.*; //  " * " --> it meens access all class from subpacages 
import java.util.Scanner; //  Scanner --> Only Access Scanner Class from subckages
public class Test1{
     public static void main(String args[]){
         Scanner scanner = new Scanner(System.in);

        //  taking int value 

         System.out.print("Enter frist value:");
         int a = scanner.nextInt();

         System.out.println("value is:"+a);


        // Taking input Of String :- there are two method to print string 
        // next() --> it use to print only "Single World" in String  -- EX. " Mahendra "
        // next() --> it use to print " Multiple  World " in String  -- EX. " Mahendra Singh Prajapati "

        System.out.print("Enter your Name:");
        String name = scanner.nextLine(); // nextLine()
        String name2 = scanner.next(); // next()
        
         System.out.println(" Name is: " +name);
         System.out.println(" Name2 is: " +name2);

    }
}