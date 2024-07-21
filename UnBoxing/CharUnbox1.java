 class CharUnbox1 {
    public static void main(String[] args) {
        char c1 = 65;
      Character c = Character.valueOf(c1); // boxing 
      char c2 = c.charValue();
      System.out.println(c2);



    }
}
