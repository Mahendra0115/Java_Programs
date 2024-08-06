package findeven;


public class FindEvenAndCopy {
    public static void main(String[] args) {
        int arr[] = {45, 25, 46, 20, 48, 23, 47};
        int arr2[] = new int[arr.length]; // Initialize arr2 with the same length as arr
        int i = 0;

        System.out.print("Original Array:");
        for (int num : arr) {
            System.out.print(" " + num); // Print elements of arr in the same line
        }
        System.out.println(); // Move to the next line

        System.out.print("Printing Even Values in Array:");
        int j = 0; // Index for arr2
        for (i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr2[j] = arr[i]; // Copy even values to arr2
                j++;
            }
        }

        System.out.print("Even Values in Array:");
        for (int k = 0; k < j; k++) { // Print only the filled elements in arr2
            System.out.print(" " +arr2[k]);

        }
        System.out.println();
    }
}
