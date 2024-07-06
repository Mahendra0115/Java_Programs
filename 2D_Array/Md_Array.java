class Md_Array {
    public static void main(String args[]){
        int arr[][] = new int[3][3];

        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;

        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;

        arr[2][0] = 7;
        arr[2][1] = 8;
        arr[2][2] = 9;

        int i= 0;

        while(i < 3){

            int j= 0;
            while (j<3) {
                System.out.print(" "+arr[i][j]);

                j=j+1;
            }
            System.out.println();
            i = i+1;
        }
       
    }
}
