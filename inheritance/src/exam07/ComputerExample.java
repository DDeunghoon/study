package exam07;

public class ComputerExample {

    public static void main(String[] args ){
        Calculator calculator = new Calculator();
        System.out.println("원면적 : " + calculator.areaCircle(10));
        Computer computer = new Computer();
        System.out.println("d원면적 : "+ computer.areaCircle(10));
    }
}
