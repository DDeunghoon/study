public class A {

    B field1 = new B();
    C field2 = new C();

    void method1() {
        B var1 = new B();
        C var2 = new C();
    }

    //static V field3 = new B();  불가능함
    static C field4 = new C();

    static void method2(){
        //B var1 = new B();
        C var2 = new C();
    }

    class B {
    }

    static class C {
    }

}
