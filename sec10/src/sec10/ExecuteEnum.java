package sec10;


import static sec10.EnumTest.ONE;

public class ExecuteEnum {

    public static void main(String[] args) {
        Service service = new Service(ONE);
        service.getResult();
    }
}
