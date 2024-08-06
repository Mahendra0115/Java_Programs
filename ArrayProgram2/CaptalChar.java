package captalchar;

import java.util.Arrays;
public class CaptalChar {
    public static void main(String[] args) {
        char arr[] = {'m','a','h','i'};

        int i =0;
        while (i<arr.length) {
           System.out.print(" "+arr[i]);
           i++;
        }
        System.out.println();
        arr[0] -= 78;
        System.out.println(Arrays.toString(arr));
    }
}
