 class PrefixEx {
    public static void main(String[] args) {
        // preefix intregal litral
        int  d = 10; // decimal form [Base - 10 ]  (0 - 9)
        System.out.println("Decimal prefix litral : "+ d);

        int o = 010; // Octa Litral form [Base - 8]  (0 - 7)
        System.out.println("Octa prefix litral: "+ o); 

        int h = 0x10 ;  // Hexadesimal  litral form [Base - 16]    {(0 - 9)  && (a - f)} 
        System.out.println("Hexadesimal  prefix form : "+ h); 


        int b = 0b101;
        System.out.println("Binary prefix form :"+ b); // binary [ 0-1 ]  Only 
       

        // char literals 

        char c1 = 'a';
        System.out.println("char is: "+ c1);

        char c2 = 65;  //  {65- A & 66 - B .......Z}
        System.out.println("char is: "+ c2);

        char c3  = 065;
        System.out.println("char is: "+ c3);

        char c4  = 0x65;
        System.out.println("char is: "+ c4);

        char c5 = 0b100100;
        System.out.println(c5);
    

    }
    

}
