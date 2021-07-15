public class Test {

    public static void main(String[] args){
        A a = new A();
        A.B b = a.new B();
        b.method1();

        A.C c = new A.C();
        c.method1();
        A.C.method2();

    }
}
