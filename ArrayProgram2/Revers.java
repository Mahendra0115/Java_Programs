package reverse;

import java.util.Arrays;

public class Revers{
    public static void main(String[] args) {
       String arr[] = {"mahi","sanu","manu","chand"};
       int i = arr.length-1;
       while (i >= 0) {
        System.out.print(" "+arr[i]);
        i--;
       }
       System.out.println();
        // System.out.println("Original String: " + arr);
    }
}
