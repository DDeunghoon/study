import java.util.Scanner;
import java.util.*;

public class test {
    public static void main(String[] args) {
        int[] a = {1,3,2,5,4};
        System.out.println(solution( a , 9));
    }

  static   public int solution(int[] d, int budget) {
        int answer = 0;
        int count = 0;
        while (budget > d[count]){
            count++;
            if (count == d.length){
                break;
            }
            answer++;
        }

        return answer;
    }
}





