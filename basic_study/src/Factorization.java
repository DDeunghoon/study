import java.util.Scanner;

public class Factorization {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("소인수 분해를 할 값을 입력하세요 ");
        int n = Integer.parseInt(scan.nextLine());
        System.out.println("값 :" + n);

        for (int i = 2; i < Math.sqrt(n); i++) {
            while (n%i == 0){
                System.out.println("i : " + i);

            }
        }
        if (n != 1){



        }

    }
}
