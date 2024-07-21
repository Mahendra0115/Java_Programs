 class IntValue_M {
    public static void main(String[] args) {

        Byte x1 = Byte.valueOf((byte)127);
        byte y1  = (byte)x1.intValue();// converting object to value 
        System.out.println("Byte:"+ y1);

        Short x2 = Short.valueOf((short)32767);
        short y2  = (short)x1.intValue();// converting object to value 
        System.out.println("Short is :"+ y2);

        Integer x3= Integer.valueOf(2147483647);
        Integer y3  = x3.intValue();// converting object to value 
        System.out.println("Integer:"+ y3);

        Float f1 = Float.valueOf(3.40E38f);
        float f2 = f1.floatValue();// converting object to value 
        System.out.println("Float is: "+f2);

        Double d1 = Double.valueOf(1.79E308);
        Double d2 = d1.doubleValue();// converting object to value 
        System.out.println("Float is: "+d2);

        Long l1 = Long.valueOf(9223372036854775807l);
        Double l2 = l1.doubleValue();// converting object to value 
        System.out.println("Long is: "+l2);

    }
   
}
