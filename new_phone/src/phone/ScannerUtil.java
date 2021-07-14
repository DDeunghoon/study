package phone;

import java.util.Scanner;

public class ScannerUtil {
    private static Scanner scanner = new Scanner(System.in);

    public static int intScan(){
        return Integer.parseInt(scanner.nextLine());
    }
    public static String stringScan(){
        return scanner.nextLine();
    }
}
