package day45_static_2;

public class StaticBlock {


    //static block
    static{
        System.out.println("STATIC BLOCK - ONCE BEFORE EVERYTHING ELSE");
    }

    // no static instance or static method in non-static inner class
    public class InnerNonStaticClass{
        public void InnerClassMethod(){
            System.out.println("Hello form inner class method");
        }
    }

    // Static inner class
    public static class InnerStaticClass{
        public static void innerStaticClassStaticMethod(){
            System.out.println("Hello from inner static class static method");
        }
        public void innerStaticClassMethod(){
            System.out.println("Hello from inner static class method");
        }
    }

    // Construction without parameters
    public StaticBlock(){
        System.out.println("CONSTRUCTOR");
    }

    // Static method
    public static void staticMethod(){
        System.out.println("STATIC METHOD");
    }
}
