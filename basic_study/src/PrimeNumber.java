public class PrimeNumber {
    public static void main(String[] args) {
        int test = prime(15);

        if (test == 0){
            System.out.println("소수가 아닙니다 ");
        }
        if (test != 0){
            System.out.println("소수 입니다");
        }


    }

    public static int prime(int x) {
        for (int i = 2; i<=x/2; i++) {
            if (x % i == 0) {
                return 0;
            }
        }
        return x;
    }
}


