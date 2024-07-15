 import java.util.*;
 class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chose Opction ");
        System.out.println("Addition       - Press : 1 ");
        System.out.println("Substraction   - Press : 2 ");
        System.out.println("Multiplication - Press : 3 ");
        System.out.println("Division       - Press : 4 ");
        System.out.println("Remendor       - Press : 5 ");


         int op = sc.nextInt();
         float res;

         System.out.println("Enter Frist value for Operation");
         int num1 = sc.nextInt();
         System.out.println("Enter Frist value for Operation");
         int num2 = sc.nextInt();

        switch(op){
             case 1:
               res = num1+num2;
             System.out.println(" Addition is "+ res);
             break;

             case 2:
               res = num1-num2;
             System.out.println(" Substruction is " + res);
             break;

             case 3:
               res = num1*num2;
             System.out.println(" Multiplication is " + res);
             break;

             case 4:
             res = num1/num2;
             System.out.println(" division is " + res);
             break;

             case 5:
             res = num1%num2;
             System.out.println(" remendor is  " + res);
             break;

            default:
            System.out.print(" invalid output : ");
        }

    }
}
