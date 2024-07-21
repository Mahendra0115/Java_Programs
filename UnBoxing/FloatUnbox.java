 class FloatUnbox {
    public static void main(String[] args) {
        float f = 4.7f;
        Float f1 = Float.valueOf(f);
        float f2 = f1.floatValue();

        System.out.println(f2);
    }
}
