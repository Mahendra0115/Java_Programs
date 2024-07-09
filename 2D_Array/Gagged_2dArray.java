 class Gagged_2dArray {
    public static void main(String[] args) {
        int arr[][];
        arr = new int[3][];

         arr[0] = new int[3];
         arr[1] = new int[2];
         arr[2] = new int[1];

         arr[0][0] = 5;
         arr[0][1] = 3;
         arr[0][2] = 9;

         arr[1][0] = 5;
         arr[1][1] = 2;

         arr[2][0] = 4;

         int i = 0;

         while(i < arr.length){
             int j = 0;
             while(j < arr[i].length){
                 System.out.print(" "+arr[i][j]);
                 j++;
             }
             i++;
             System.out.println();
         }
         System.out.println();
    }
}
