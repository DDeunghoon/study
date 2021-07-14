public class TireExample {
    public static void main(String[] args ) {
        Tire tire1 = new HankookTire();
        Tire tire2 = new KumgoTire();

        tire1.roll();
        tire2.roll();
    }
}
