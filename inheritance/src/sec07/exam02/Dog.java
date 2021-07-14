package sec07.exam02;

public class Dog extends Animal{
    public Dog(){
        this.kind = "포유류";
        //추상 클래스도 super로 값을 넣어야하는지
    }

    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}
