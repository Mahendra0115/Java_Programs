// Multi dimentional Array -->  2D Array


class Array2D {
    public static void main(String args[]){
        int arr[][] = new int[2][3];
        
        // array value 

        arr[0][0] = 10;
        arr[0][1] = 45;
        arr[0][2] = 12;

        arr[1][0] = 10;
        arr[1][1] = 11;
        arr[1][2] = 12;


  // logic 
  int r = 0;
  int c = 0;
  while(r<arr.length){
   c = 0;
    while(c<arr[r].length){
        System.out.print(" "+ arr[r][c]);
        c++;
    }
    r++;
    System.out.println();
   }

    }
}