public class Array_Avg {

    /* 
  public static void main(String args[]){
    int arr1[] = {12,45,64,35,45,67};

    float Avg = 0;
    int sum = 0;

    int i = 0;
    while(i <= 5 ){
        sum = sum+arr1[i];
        Avg = (sum)/5;

        i++;
    }

    System.out.println("Avg is: "+Avg);

  }

   */

                        // take nothing return somthing 

   /* 
      static int Demo(){
        int arr1 [] = {8,6,5,8,3,4};
        int i = 0;
        int sum = 0 ;
        int avg ;
   
        for(i=0; i <= 5; i++){
            sum = sum + arr1[i];
           
        }
        avg = sum/5;
        return avg;
      }
      

   public static void main (String args[]){
    
        float avg = Demo();
        System.out.println("Avg : " +avg);

        
        
   }
        */

        // take somthing return somthing
        
        static int Demo(int arr1[], int dis,int sum){
            
            
            for(int i=0; i <= 5; i++){
                dis = dis+(arr1[i]*10/100);
                sum = dis;
               
            }
            
            return sum;
          }
          
    
       public static void main (String args[]){
        int arr1 []= {40,60,70,80,60,50};
        int sum = 0;
        int dis = 0;

        float result ;

             result = Demo(arr1,sum, dis);
            System.out.println(" Extra dis : " +result);
    
            
            
       }

}
