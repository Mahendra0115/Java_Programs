 class Test {
    public static void main(String[] args) {
        Dummy dummy = new Dummy();
        System.out.println(dummy.a);// calling varr by Class_Obj
        System.out.println(Dummy.b);// claaing varr by Class_Name

    }
}

class Dummy{
    int a;
    static int b;
}
