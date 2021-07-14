import java.util.Scanner;

public class ScannerUtil {

  private static Scanner scanner = new Scanner(System.in);


  public static String stringScan(){
     return scanner.nextLine();
  }
  public static int intScan(){
      return Integer.parseInt(scanner.nextLine());
  }

}
