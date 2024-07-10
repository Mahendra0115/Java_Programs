class N_static_To_N_static {

    void M1(){
      System.out.println("This is also Non-Static Method: ");
    }

    void M2(){
        System.out.println("This is  Non-Static Method: ");
          M1();
    }
    public static void main(String[] args) {
        N_static_To_N_static obj = new N_static_To_N_static();
        obj.M2(); 
    }
}
