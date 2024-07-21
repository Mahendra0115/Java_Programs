  // ParseXXX() --> this is static method. this is aslo  use for converting (String to Value). XXX-(int,short,long.......)
 class StringToValue {
    public static void main(String[] args) {

        String s2 = "125";
        byte b = Byte.parseByte(s2); // converting String to Byte
        System.out.println("Byte: "+ b);


        String s6 = "512";
        Short so = Short.parseShort(s6); // converting String to Short
        System.out.println("Short is :" +so);


        String s = "1505154";
        int s1  = Integer.parseInt(s); // converting String to Integer
        System.out.println("Integer is:" +s1);

        
        String s3 = "45.4876";
        Double d = Double.parseDouble(s3); // converting String to Double
        System.out.println("Double is: "+d);

        
        String s5 = "45755";
        Float f =Float.parseFloat(s5);  // converting String to Float
        System.out.println("Float is: "+f);


        String s7 = "45755";
        Long l = Long.parseLong(s7); // converting String to Long
        System.out.println("Long is: " +l);
        


    }
}
