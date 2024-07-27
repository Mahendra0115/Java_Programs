
class Array3D {
    public static void main(String[] args) {
        int arr[][][] = new int[2][3][3]; // {{4,5,6},{1,3,8},{9,4,7},{10,14,7}};

        arr[0][0][0] = 11;
        arr[0][0][1] = 12;
        arr[0][0][2] = 12;

        arr[0][1][0] = 13;
        arr[0][1][1] = 14;
        arr[0][1][2] = 12;

        arr[0][2][0] = 15;
        arr[0][2][1] = 16;
        arr[0][2][2] = 16;

        arr[1][0][0] = 17;
        arr[1][0][1] = 18;
        arr[1][0][2] = 18;

        arr[1][1][0] = 19;
        arr[1][1][1] = 20;
        arr[1][1][2] = 20;

        arr[1][2][0] = 21;
        arr[1][2][1] = 22;
        arr[1][2][2] = 22;

        int r = 0; // Use for Base Array
        int c = 0;
        int k = 0;

        // Use for SubArray

        // Nested while loop
        while (r < arr.length) {
            c = 0;
            while (c < arr[r].length) {
                k = 0;
                while (k < arr[r][c].length) {
                    System.out.print(" " + arr[r][c][k]);
                    k++;
                }
                c++;
                System.out.println();
            }
            r++;
            System.out.println();
        }
    }

}
