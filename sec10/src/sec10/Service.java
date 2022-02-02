package sec10;

public class Service {
    private EnumTest enumTest;

    public Service(EnumTest enumTest) {
        this.enumTest = enumTest;
    }
    public void getResult(){
        System.out.println(enumTest.getNumber());
        System.out.println(enumTest.getStingNumber());
    }
}
