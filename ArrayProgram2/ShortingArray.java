package shortingarray;
import java.util.Arrays;
public class ShortingArray {
    public static void main(String[] args) {
        String arr[] = {"hello","mahi","chand","parchi"};
        // Printing Array
        System.out.println(Arrays.toString(arr));

        // Shorting Array
        Arrays.sort(arr);
        Arrays.fill(arr, "rohit");
        System.out.println(Arrays.toString(arr));

    }
}
