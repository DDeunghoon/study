public class Child extends Parent {

    class A {
        Parent field = new Child();

        void method() {
            Parent localvar = new Child();
        }
    }
}
