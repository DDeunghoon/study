public class MyClassExample {
    public static void main(String[] args ){
        System.out.println("1.------------");
        MyClass myClass = new MyClass();
        myClass.rc.turnOn();
        myClass.rc.setVolume(5);

        System.out.println("2.-------------");
        MyClass myClass1 = new MyClass(new Audio());

        System.out.println("3.-----------");
        MyClass myClass2 = new MyClass();
        myClass2.methodA();
    }
}
