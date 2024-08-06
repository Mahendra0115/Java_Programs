package call;

import package1.*;
import package2.package1.SubPack;

public class Main {
    public static void main(String[] args) {
        SubPack subpack = new SubPack();
        subpack.m1(4,6);
        
        Demo demo = new Demo();
        demo.m2();

        
    }
}
