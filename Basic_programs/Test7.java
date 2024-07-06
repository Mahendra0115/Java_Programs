// package Basi_programs;
import java.util.Scanner;

class Test7{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the mode: ");
        String mode = sc.next();

       String color = "" ;
    //    String mode = "white";

       if(mode == "black"){
        color = "white";
       }else{
        color = "black";
       }

       System.out.print(color);
    }
}