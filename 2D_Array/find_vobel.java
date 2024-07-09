class find_vobel {
    public static void main(String[] args) {
        String arr[][] = {{"m", "a", "h"},{"c", "n", "i"},{"j", "a", "b"}};
        String vovel="";
        String cons="";
        int i = 0;

        while (i < arr.length) {
            int j=0;
              while(j<arr.length){
                
                if (arr[i][j] == "a" || arr[i][j]== "e" || arr[i][j] == "i" || arr[i][j]== "o" || arr[i][j] == "u") {
                   
                    vovel = vovel+ " " + arr[i][j];
                   
                   
                    // vovel++;
                } else {
                   
                    cons = cons+ " " +arr[i][j];
                  
                }
               
                j++;
              
              }
      
            i++;
            
        }
        System.out.println("vovel is :   "+vovel);
        System.out.println(" const is : "+ cons);
    }
}
