package sec10;

public enum EnumTest {
    ONE(1,"하나"),
    TWO(2,"둘");

    private int number;
    private String stingNumber;

    EnumTest(int number, String stingNumber ) {
        this.number = number;
        this.stingNumber = stingNumber;
    }

    public int getNumber() {
        return number;
    }

    public String getStingNumber() {
        return stingNumber;
    }
}
