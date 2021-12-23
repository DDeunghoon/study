import java.util.Scanner;

public class BinaryNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] a = new int[10];

        System.out.println("이진수로 변환할 10진수를 입력하세요 ");
        int b = Integer.parseInt(scanner.nextLine());;
        System.out.println("입력한 숫자" + b);
        for (int i = 0; i< a.length; i++){
            int mok = b/2;
            int nmg = b%2;
             a[i] = nmg;
             b = mok;
             if (mok == 0){
                 break;
             }
        }
        for (int i = 0; i <a.length; i++){
            System.out.print(a[9-i]);
        }


    }
}
