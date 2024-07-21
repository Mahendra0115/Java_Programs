 class DoubleUnbox {
     public static void main(String[] args) {
        double d = 4512.7955;
        Double d1 = Double.valueOf(d);
        double d2 = d1.doubleValue();
        System.out.println(d2);
     }
}
