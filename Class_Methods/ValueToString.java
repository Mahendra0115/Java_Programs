 
  // toString() --> this is static method. this is aslo  use for converting (Value to String) 
 class ValueToString {

    public static void main(String[] args) {

        byte b = 65;
        String s2 = Byte.toString(b);
        System.out.println(s2);

        
        short srt = 45;
        String str1 = Short.toString(srt); // convertring Short to string
        System.out.println("Short to String: "+ str1);

        int  s = 100;
        String str = Integer.toString(s); // convertring Integer to string
        System.out.println("Interger to String: "+str);
        

        long l = 4562379;
        String l1 = Long.toString(l);  // convertring Long to string
        System.out.println(l1);


        float f = 45.7f;
        String s4 = Float.toString(f);  // convertring Float to string
        System.out.println(s4);

        double d = 450.656;
        String d1 = Double.toString(d);  // convertring Double to string
        System.out.println(d1);

        char c = 'M';
        String s5 = Character.toString(c);  // convertring charactor  to string
        System.out.println(s5);

    }
}
