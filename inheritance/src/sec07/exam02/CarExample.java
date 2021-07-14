package sec07.exam02;

public class CarExample {
    public static void main(String[] args) {
        Car car = new Car();

        for (int i = 0; i <= 5; i++) {
            int problemLocation = car.run();
            switch (problemLocation) {
                case 1:
                    System.out.println("앞 왼쪽 한국타이어로 교체 ");
                    car.frontLeftTire = new HankookTire(15, "앞 왼쪽");
                    break;
                case 2:
                    System.out.println("앞 오른쪽 금호타이어로 교체 ");
                    car.frontRightTire = new KumhoTire(13, " 앞 오른쪽");
                    break;
                case 3:
                    System.out.println("뒤 왼쪽 한국타이어로 교체 ");
                    car.backLeftTire = new HankookTire(14, " 뒤 왼쪽");
                    break;
                case 4:
                    System.out.println("뒤오른쪽 금호타이어로 교체 ");
                    car.backRightTire = new KumhoTire(17, "뒤오른쪽");
                    break;
            }
            System.out.println("=====================");
        }

    }
}
