public class Test {

    public static void main(String[] args){
        H a = new H();
        H.B b = a.new B();
        b.method1();

        H.C c = new H.C();
        c.method1();
        H.C.method2();



    }
}
