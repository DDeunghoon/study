package sec07.exam02;

public class HankookTire extends Tire{

    public HankookTire(int accumulatedRotation, String location) {
        super(accumulatedRotation, location);
    }

    @Override
    public boolean roll() {
        ++accumulatedRotation;
        if(accumulatedRotation<maxRotation){
            System.out.println(location + "HankookTire 수명 " + (maxRotation - accumulatedRotation)+  "회");
            return true;
        }else {
            System.out.println("****" + location + " HankookTire 펑크");
            return false;

        }

    }
}
