class Gretestfind {
    public static void main(String[] args) {
        int arr[][] = { { 8, 66, 1 }, { 8, 6, 5 }, { 5, 85, 6 } };

        int maxvalue = 0;
        // int frow = 0;
        int i = 0;

        while (i < arr.length) {

            int j = 0;
            while (j < arr.length) {

                // only find max in frist_row
                /*
                 * if (arr[0][i] > maxvalue) {
                 * maxvalue = arr[0][i];
                 * }
                 * 
                 */

                // find max in over all array
                if (arr[i][j] > maxvalue) {
                    maxvalue = arr[i][j];

                } 

                j++;
            }
            i++;

        }

        // find prime no in Array
        if (maxvalue % maxvalue == 0 && maxvalue % 2 == 0) {
            System.out.println("prime no: ");
        } else {
            System.out.println("not prime no: ");
        }

        System.out.println("max is: " + maxvalue);
        // System.out.println("frist row max value is: "+frow);
    }
}
