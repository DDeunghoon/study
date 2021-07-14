package sec07.exam02;

public class Car {
    Tire frontLeftTire = new Tire(6, "앞 왼쪽 ");
    Tire frontRightTire = new Tire(2, "앞 오른쪽 ");
    Tire backLeftTire = new Tire(3, "뒤 왼쪽 ");
    Tire backRightTire = new Tire(4, "뒤 오른쪽");

    public int run(){
        System.out.println("[자동차가 달립니다]");
        if(frontLeftTire.roll() == false){stop(); return 1;}
        if(frontRightTire.roll() == false){stop(); return 2;}
        if(backLeftTire.roll() == false){stop(); return 3;}
        if(backRightTire.roll() == false){stop(); return 4;}
        return 0;
    }
    public void stop(){
        System.out.println("자동차가 멈춥니다 ");
    }
}
