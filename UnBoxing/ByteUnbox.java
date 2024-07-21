 class ByteUnbox {
    public static void main(String[] args) {
        
        byte x = 45;
        Byte y = Byte.valueOf(x);// boxing
        Byte b = y.byteValue(); // Unboxing
        System.out.println(b);

    }
}
