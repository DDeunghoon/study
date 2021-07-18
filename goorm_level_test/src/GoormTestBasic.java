public class GoormTestBasic {
    //3과 5의 배수 1000이하의 자연수를 입력하고 3의배수 5의 배수의 합을 구하는 프로그램을 작성

    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        for (int i = 0; i <= 1000; i += 3) {
            a += i;
        }
        for(int i = 0; i <= 1000; i+=5){
            b += i;
        }
        int result = a+b;
        System.out.println("3과 5의 배수의 합은 " + result);
    }
}
