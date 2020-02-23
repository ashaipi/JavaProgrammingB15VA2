package day45_static_2;

public class VariableAccess {
    int instanceCount = 10;
    static int staticCount = 15;

    public static void staticMethod(){
        System.out.println(staticCount);
    }

    public void nonStaticInstanceMethod(){
        System.out.println("instanceCount = " + instanceCount);
        System.out.println("staticCount = " + staticCount);
    }
}
