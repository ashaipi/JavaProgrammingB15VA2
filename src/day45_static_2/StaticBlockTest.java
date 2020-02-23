package day45_static_2;

public class StaticBlockTest {
    public static void main(String[] args) {
        StaticBlock.staticMethod();
        StaticBlock sbObj1 = new StaticBlock();
        StaticBlock sbObj2 = new StaticBlock();

        // non-static inner class
        //StaticBlock.InnerNonStaticClass inner = new StaticBlock.InnerNonStaticClass();
        //inner.InnerClassMethod();

        // Static inner class call inner static method
        StaticBlock.InnerStaticClass.innerStaticClassStaticMethod();

        // Static inner class call inner method
        StaticBlock.InnerStaticClass ob = new StaticBlock.InnerStaticClass();
        ob.innerStaticClassMethod();


    }
}
