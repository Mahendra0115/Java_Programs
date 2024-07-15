 
//  class ReverseValue {
//     public static void main(String[] args) {
//         int num = 121;
//         int r = 0 ;
//         int s = 0 ;
//         int t = num;
    

//         while(num != 0){
    
//               r = num%10;
//               s = s*10+r;
//               num = num/10;
    
         
//         }
//         System.out.println("reverse number is : "+s);
//         if(t == s ){
//             System.out.println("palandrom:");
//         }else{
//                 System.out.println("not palandrom: ");
//          }
//     }
    
//  }

import java.util.*;
class ReverseValue{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r,s = 0;

        System.out.println("enter the number : "+s);
        int num = sc.nextInt(); 

        int t = num;
        while(num != 0){
            r = num%10;
            s = s*10+r;
            num = num/10;

            // num++;
        }
        System.out.println("reverse numbers is:"+s);
        if(t == s){
            System.out.println("Palandrom number: ");
        }
        else{
            System.out.println("not palandrom: ");
        }
    }
}

