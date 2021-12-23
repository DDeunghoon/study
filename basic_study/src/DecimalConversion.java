import java.util.Scanner;

public class DecimalConversion {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        
        String n2 = Integer.toBinaryString(num);
        String n8 = Integer.toOctalString(num);
        String n16 = Integer.toHexString(num);



        System.out.println("2진수: " + n2);
        System.out.println("8진수: " + n8);
        System.out.println("16진수: " + n16);


    }
}
