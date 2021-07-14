package sec07.exam02;

public class ChildExample {
    public static void main(String[] args) {
        Parent parent = new Child();
        parent.methode1();
        parent.methode2();
        // parent.methode3(); 호출불가능
    }
}
