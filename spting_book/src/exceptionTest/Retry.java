package exceptionTest;

public class Retry {
    int maxretry = MAX_RETRY;
    while(maxretry-->0){
        try {
            ...
            return;
        }
        catch (SomeException e){
            //로그 출력. 정해진 시간만큼 대기
        }finally {
            //리소스 반납 정리작업
        }
    }
    throw new RetryFailedException(); //최대 재시도 횟수를 넘기면 직접 예외 발생 
}
