package sec07.exam02;

public class Cat extends Animal{
    public Cat(){
        this.kind = " 포유류";
    }

    @Override
    public void sound() {
        System.out.println("야오오오옹");
    }
}
